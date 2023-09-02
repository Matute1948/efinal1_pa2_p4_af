package com.uce.efinal2_pa2_p4_al.service;

import java.util.List;

import com.uce.efinal2_pa2_p4_al.repository.modelo.dto.ReporteDTO;

public interface IMatriculaService {
    public void insertar(String cedula, String codigo1,String codigo2, String codigo3, String codigo4);
    public List<ReporteDTO> seleccionarTodo();
}
