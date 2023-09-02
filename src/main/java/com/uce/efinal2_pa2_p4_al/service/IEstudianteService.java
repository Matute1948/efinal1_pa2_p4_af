package com.uce.efinal2_pa2_p4_al.service;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Estudiante;

public interface IEstudianteService {
    public void agregar(Estudiante estudiante);
    public void actualizar(Estudiante estudiante);
    public Estudiante buscarPorCedula(String cedula);
}
