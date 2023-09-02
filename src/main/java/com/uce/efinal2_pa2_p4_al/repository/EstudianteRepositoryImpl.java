package com.uce.efinal2_pa2_p4_al.repository;

import org.springframework.stereotype.Repository;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(value = TxType.MANDATORY)
    public void insertar(Estudiante estudiante) {
        this.entityManager.persist(estudiante);
    }

    @Override
    @Transactional(value = TxType.MANDATORY)
    public void actualizar(Estudiante estudiante) {
        this.entityManager.merge(estudiante);
    }

    @Override
    @Transactional(value = TxType.NOT_SUPPORTED)
    public Estudiante seleccionarPorCedula(String cedula) {
        TypedQuery<Estudiante> mTypedQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.cedula=:datoCedula", Estudiante.class);
        mTypedQuery.setParameter("datoCedula",cedula);
        return mTypedQuery.getSingleResult();
    }
}
