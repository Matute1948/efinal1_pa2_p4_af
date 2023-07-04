package com.example.efinal1_pa2_p4_af.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.efinal1_pa2_p4_af.repository.PacienteRepository;
import com.example.efinal1_pa2_p4_af.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService{
    @Autowired
    private PacienteRepository PacienteRepository;
    @Override
    public void agregar(Paciente paciente) {
        this.PacienteRepository.insertar(paciente);
    }

    @Override
    public void eliminar(Integer id) {
        this.PacienteRepository.eliminar(id);
    }

    @Override
    public void actualizar(Paciente paciente) {
        this.PacienteRepository.actualizar(paciente);
    }

    @Override
    public Paciente buscarPorId(Integer id) {
        return this.buscarPorId(id);
    }
}
