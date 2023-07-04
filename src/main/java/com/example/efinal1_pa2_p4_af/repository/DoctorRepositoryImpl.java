package com.example.efinal1_pa2_p4_af.repository;

import org.springframework.stereotype.Repository;

import com.example.efinal1_pa2_p4_af.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepositoryImpl implements DoctorRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void insertar(Doctor doctor) {
        this.entityManager.persist(doctor);
    }

    @Override
    public void eliminar(Integer id) {
        Doctor doctor = this.seleccionarPorId(id);
        this.entityManager.remove(doctor);
    }

    @Override
    public void actualizar(Doctor doctor) {
        this.entityManager.merge(doctor);
    }

    @Override
    public Doctor seleccionarPorId(Integer id) {
        return this.entityManager.find(Doctor.class,id);
    }
    
}
