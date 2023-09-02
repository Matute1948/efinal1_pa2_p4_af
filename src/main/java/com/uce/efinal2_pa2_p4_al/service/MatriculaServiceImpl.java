package com.uce.efinal2_pa2_p4_al.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.efinal2_pa2_p4_al.repository.IEstudianteRepository;
import com.uce.efinal2_pa2_p4_al.repository.IMatriculaRepository;
import com.uce.efinal2_pa2_p4_al.repository.modelo.Estudiante;
import com.uce.efinal2_pa2_p4_al.repository.modelo.Materia;
import com.uce.efinal2_pa2_p4_al.repository.modelo.Matricula;
import com.uce.efinal2_pa2_p4_al.repository.modelo.dto.ReporteDTO;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
@Transactional
public class MatriculaServiceImpl implements IMatriculaService{
    @Autowired
    private IMatriculaRepository matriculaRepository;
    private IEstudianteRepository estudianteRepository;
    private IMateriaService materiaService;

    @Override
    @Transactional(value = TxType.REQUIRED)
    public void insertar(String cedula, String codigo1, String codigo2, String codigo3, String codigo4) {
        Estudiante estudiante = this.estudianteRepository.seleccionarPorCedula(cedula);
        List<Materia> materias = new ArrayList<>();
        Materia materia1 = this.materiaService.buscarPorCodigo(codigo1);
        Materia materia2 = this.materiaService.buscarPorCodigo(codigo2);
        Materia materia3 = this.materiaService.buscarPorCodigo(codigo3);
        Materia materia4 = this.materiaService.buscarPorCodigo(codigo4);
        materias.add(materia1);
        materias.add(materia2);
        materias.add(materia3);
        materias.add(materia4);
        List<Matricula> matriculas = new ArrayList<>();
        for (Materia materiaIt : materias) {
            Matricula matricula = new Matricula();
            matricula.setEstudiante(estudiante);
            matricula.setFecha(LocalDate.now());
            matricula.setMateria(materiaIt);
            matriculas.add(matricula);
        }

        matriculas.parallelStream().forEach(mat -> {
            mat.setNombreHilo(""+Thread.currentThread().getName());
            this.matriculaRepository.insertar(mat);
        }); 
    }

    @Override
    @Transactional(value = TxType.REQUIRED)
    public List<ReporteDTO> seleccionarTodo() {
        return null;
    }
}
