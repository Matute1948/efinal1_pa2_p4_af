package com.uce.efinal2_pa2_p4_al.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.efinal2_pa2_p4_al.repository.IEstudianteRepository;
import com.uce.efinal2_pa2_p4_al.repository.modelo.Estudiante;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
@Transactional
public class EstudianteServiceImpl implements IEstudianteService{
    @Autowired
    private IEstudianteRepository estudianteRepository;

    @Override
    @Transactional(value = TxType.REQUIRED)
    public void agregar(Estudiante estudiante) {
        this.estudianteRepository.insertar(estudiante);
    }

    @Override
    @Transactional(value = TxType.REQUIRED)
    public void actualizar(Estudiante estudiante) {
        this.estudianteRepository.actualizar(estudiante);
    }

    @Override
    @Transactional(value = TxType.REQUIRED)
    public Estudiante buscarPorCedula(String cedula) {
        return this.estudianteRepository.seleccionarPorCedula(cedula);
    }

}
