package com.example.efinal1_pa2_p4_af.repository;

import com.example.efinal1_pa2_p4_af.repository.modelo.Paciente;

public interface PacienteRepository {
    public void insertar(Paciente paciente);
    public void eliminar(Integer id);
    public void actualizar(Paciente paciente);
    public Paciente seleccionarPorId(Integer id);
    
}
