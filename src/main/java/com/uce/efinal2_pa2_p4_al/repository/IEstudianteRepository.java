package com.uce.efinal2_pa2_p4_al.repository;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Estudiante;

public interface IEstudianteRepository {
    public void insertar(Estudiante estudiante);
    public void actualizar(Estudiante estudiante);
    public Estudiante seleccionarPorCedula(String cedula);
}
