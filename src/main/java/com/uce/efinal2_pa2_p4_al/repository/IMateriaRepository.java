package com.uce.efinal2_pa2_p4_al.repository;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Materia;

public interface IMateriaRepository {
    public void insertar(Materia materia);
    public void actualizar(Materia materia);
    public Materia seleccionarPorCodigo(String codigo);

}
