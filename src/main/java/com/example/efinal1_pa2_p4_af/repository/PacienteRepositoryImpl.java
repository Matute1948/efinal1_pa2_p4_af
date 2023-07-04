package com.example.efinal1_pa2_p4_af.repository;

import org.springframework.stereotype.Repository;

import com.example.efinal1_pa2_p4_af.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class PacienteRepositoryImpl implements PacienteRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void insertar(Paciente paciente) {
        this.entityManager.persist(paciente);
    }

    @Override
    public void eliminar(Integer id) {
        Paciente paciente = this.seleccionarPorId(id);
        this.entityManager.remove(paciente);
    }

    @Override
    public void actualizar(Paciente paciente) {
        this.entityManager.merge(paciente);
    }

    @Override
    public Paciente seleccionarPorId(Integer id) {
        return this.entityManager.find(Paciente.class,id);
    }
}
