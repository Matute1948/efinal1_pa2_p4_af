package com.example.efinal1_pa2_p4_af.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.efinal1_pa2_p4_af.repository.modelo.CitaMedica;

public interface CitaMedicaRepository {
    public void insertar(CitaMedica citaMedica);
    public void eliminar(Integer id);
    public void actualizar(CitaMedica citaMedica);
    public CitaMedica seleccionarPorId(Integer id);
    public void insertarPorParametros(String numeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita, String cedulaDoctor, String cedulaPaciente);
    public void actualizarPorParametros(String numeroCita, String diagnotico, String receta, LocalDate fechaProximaCita);
    
}
