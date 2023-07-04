package com.example.efinal1_pa2_p4_af.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.example.efinal1_pa2_p4_af.repository.modelo.CitaMedica;
import com.example.efinal1_pa2_p4_af.repository.modelo.Doctor;
import com.example.efinal1_pa2_p4_af.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements CitaMedicaRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void insertar(CitaMedica citaMedica) {
        this.entityManager.persist(citaMedica);
    }

    @Override
    public void eliminar(Integer id) {
        CitaMedica citaMedica = this.seleccionarPorId(id);
        this.entityManager.remove(citaMedica);
    }

    @Override
    public void actualizar(CitaMedica citaMedica) {
        this.entityManager.merge(citaMedica);
    }

    @Override
    public CitaMedica seleccionarPorId(Integer id) {
        return this.entityManager.find(CitaMedica.class,id);
    }

    @Override
    public void insertarPorParametros(String numeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
            String cedulaDoctor, String cedulaPaciente) {

        Query queryDoc = this.entityManager.createQuery("SELECT e FROM Doctor e WHERE e.cedula =: datoCedula");
        queryDoc.setParameter("datoCedula", cedulaDoctor);
        Doctor doc = (Doctor)queryDoc.getSingleResult();
        Query queryPas = this.entityManager.createQuery("SELECT e FROM Paciente e WHERE e.cedula =: datoCedula");
        queryPas.setParameter("datoCedula", cedulaPaciente);
        Paciente pas = (Paciente)queryPas.getSingleResult();

        CitaMedica citaMedica = new CitaMedica();
        citaMedica.setNumeroCita(numeroCita);
        citaMedica.setFechaCita(fechaCita);
        citaMedica.setValorCita(valorCita);
        citaMedica.setLugarCita(lugarCita);
        citaMedica.setDiagnotico("Presenta alta temperatura especificamente 37 grados");
        citaMedica.setFechaProximaCita(LocalDate.of(2023, 2, 12));
        citaMedica.setDoctor(doc);
        citaMedica.setPasciente(pas);
        citaMedica.setReceta("baños con agua templada e hidratarse mucho y un paracetamol");
        this.insertar(citaMedica);
    }

    @Override
    public void actualizarPorParametros(String numeroCita, String diagnotico, String receta,
            LocalDate fechaProximaCita) {
        
        Query queryCM = this.entityManager.createQuery("SELECT e FROM CitaMedica e WHERE e.numeroCita =: datoNumeroCita");
        queryCM.setParameter("datoNumeroCita", numeroCita);
        CitaMedica citaMedica = (CitaMedica)queryCM.getSingleResult();

        citaMedica.setDiagnotico(diagnotico);
        citaMedica.setReceta(receta);
        citaMedica.setFechaProximaCita(fechaProximaCita);
        
        this.actualizar(citaMedica);
        
    }
    
}
