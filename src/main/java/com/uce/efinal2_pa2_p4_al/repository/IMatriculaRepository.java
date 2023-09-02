package com.uce.efinal2_pa2_p4_al.repository;

import java.util.List;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Matricula;
import com.uce.efinal2_pa2_p4_al.repository.modelo.dto.ReporteDTO;

public interface IMatriculaRepository {
    public void insertar(Matricula matricula);
    public List<ReporteDTO> seleccionarTodo();
    
}
