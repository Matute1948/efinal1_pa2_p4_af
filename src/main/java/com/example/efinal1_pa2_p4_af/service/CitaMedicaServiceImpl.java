package com.example.efinal1_pa2_p4_af.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.efinal1_pa2_p4_af.repository.CitaMedicaRepository;
import com.example.efinal1_pa2_p4_af.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService{
    @Autowired
    private CitaMedicaRepository citaMedicaRepository;
    @Override
    public void agregar(CitaMedica citaMedica) {
        this.citaMedicaRepository.insertar(citaMedica);
    }

    @Override
    public void eliminar(Integer id) {
        this.citaMedicaRepository.eliminar(id);
    }

    @Override
    public void actualizar(CitaMedica citaMedica) {
        this.citaMedicaRepository.actualizar(citaMedica);
    }

    @Override
    public CitaMedica buscarPorId(Integer id) {
        return this.citaMedicaRepository.seleccionarPorId(id);
    }

    @Override
    public void agendarPorParametros(String numeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
            String cedulaDoctor, String cedulaPaciente) {
        this.citaMedicaRepository.insertarPorParametros(numeroCita, fechaCita, valorCita, lugarCita, cedulaDoctor, cedulaPaciente);
        
    }

    @Override
    public void actualizarPorParametros(String numeroCita, String diagnotico, String receta,
            LocalDate fechaProximaCita) {
        this.citaMedicaRepository.actualizarPorParametros(numeroCita, diagnotico, receta, fechaProximaCita);      

    }
    
}
