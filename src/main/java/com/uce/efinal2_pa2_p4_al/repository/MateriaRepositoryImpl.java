package com.uce.efinal2_pa2_p4_al.repository;

import org.springframework.stereotype.Repository;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Repository
@Transactional
public class MateriaRepositoryImpl  implements IMateriaRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(value = TxType.MANDATORY)
    public void insertar(Materia materia) {
        this.entityManager.persist(materia);
    }

    @Override
    @Transactional(value = TxType.MANDATORY)
    public void actualizar(Materia materia) {
        this.entityManager.merge(materia);
    }

    @Override
    @Transactional(value = TxType.NOT_SUPPORTED)
    public Materia seleccionarPorCodigo(String codigo) {
        TypedQuery<Materia> mTypedQuery = this.entityManager.createQuery("SELECT m FROM Materia m WHERE m.codigo=:datoCod", Materia.class);
        mTypedQuery.setParameter("datoCod",codigo);
        return mTypedQuery.getSingleResult();
    }
}
