package com.uce.efinal2_pa2_p4_al.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Matricula;
import com.uce.efinal2_pa2_p4_al.repository.modelo.dto.ReporteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional(value = TxType.MANDATORY)
    public void insertar(Matricula matricula) {
        this.entityManager.persist(matricula);
    }

    @Override
    @Transactional(value = TxType.NOT_SUPPORTED)
    public List<ReporteDTO> seleccionarTodo() {
        TypedQuery<ReporteDTO> mTypedQuery = this.entityManager.createQuery("SELECT NEW com.uce.efinal2_pa2_p4_al.repository.modelo.dtoReporteDTO(e.cedula,a.codigo,m.fecha,m.nombreHilo) FROM Matricula m JOIN m.estudiante e JOIN m.materia a", ReporteDTO.class);
        return mTypedQuery.getResultList();
    }
    
}
