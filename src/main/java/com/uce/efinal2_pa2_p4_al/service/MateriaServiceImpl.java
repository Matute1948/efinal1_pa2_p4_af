package com.uce.efinal2_pa2_p4_al.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.efinal2_pa2_p4_al.repository.IMateriaRepository;
import com.uce.efinal2_pa2_p4_al.repository.modelo.Materia;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
@Transactional
public class MateriaServiceImpl implements IMateriaService{
    @Autowired
    private IMateriaRepository materiaRepository;

    @Override
    @Transactional(value = TxType.REQUIRED)
    public void agregar(Materia Materia) {
        this.materiaRepository.insertar(Materia);
    }

    @Override
    @Transactional(value = TxType.REQUIRED)
    public void actualizar(Materia Materia) {
        this.materiaRepository.actualizar(Materia);
    }

    @Override
    @Transactional(value = TxType.REQUIRED)
    public Materia buscarPorCodigo(String codigo) {
        return this.materiaRepository.seleccionarPorCodigo(codigo);
    }
}
