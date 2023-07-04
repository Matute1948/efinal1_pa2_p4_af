package com.example.efinal1_pa2_p4_af.service;

import com.example.efinal1_pa2_p4_af.repository.modelo.Paciente;

public interface PacienteService {
    public void agregar(Paciente paciente);
    public void eliminar(Integer id);
    public void actualizar(Paciente paciente);
    public Paciente buscarPorId(Integer id);
}
