package com.uce.efinal2_pa2_p4_al.repository.modelo.dto;

import java.time.LocalDate;

public class ReporteDTO {
    
    private String cedula;
    private String codigo;
    private LocalDate fecha;
    private String nombreHilo;
    
    public ReporteDTO() {
    }
    public ReporteDTO(String cedula, String codigo, LocalDate fecha, String nombreHilo) {
        this.cedula = cedula;
        this.codigo = codigo;
        this.fecha = fecha;
        this.nombreHilo = nombreHilo;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getNombreHilo() {
        return nombreHilo;
    }
    public void setNombreHilo(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }
    @Override
    public String toString() {
        return "ReporteDTO [cedula=" + cedula + ", codigo=" + codigo + ", fecha=" + fecha + ", nombreHilo=" + nombreHilo
                + "]";
    }
    

}
