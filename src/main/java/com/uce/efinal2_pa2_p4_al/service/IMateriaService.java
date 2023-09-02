package com.uce.efinal2_pa2_p4_al.service;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Materia;

public interface IMateriaService {
    public void agregar(Materia materia);
    public void actualizar(Materia materia);
    public Materia buscarPorCodigo(String codigo);
}
