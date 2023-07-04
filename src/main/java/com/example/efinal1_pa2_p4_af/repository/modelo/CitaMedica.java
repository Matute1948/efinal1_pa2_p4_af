package com.example.efinal1_pa2_p4_af.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Table(name = "cita_medica")
@Entity
public class CitaMedica {
    @GeneratedValue(generator = "seq_cita_medica", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_cita_medica", sequenceName = "seq_cita_medica",allocationSize = 1)
    @Id
    @Column(name = "cime_id")
    private Integer id;
    @Column(name = "cime_numero_cita")
    private String numeroCita;
    @Column(name = "cime_fecha_cita")
    private LocalDate fechaCita;
    @Column(name = "cime_valor_cita")
    private BigDecimal valorCita;
    @Column(name = "cime_lugar_cita")
    private String lugarCita;
    @Column(name = "cime_diagnostico")
    private String diagnotico;
    @Column(name = "cime_receta")
    private String receta;
    @Column(name = "cime_fecha_proxima_cita")
    private LocalDate fechaProximaCita;
    @ManyToOne
    @JoinColumn(name = "citas_id_paciente")
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name = "citas_id_doctores")
    private Doctor doctor;
    
    //set y get 
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumeroCita() {
        return numeroCita;
    }
    public void setNumeroCita(String numeroTurno) {
        this.numeroCita = numeroTurno;
    }
    public LocalDate getFechaCita() {
        return fechaCita;
    }
    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }
    public BigDecimal getValorCita() {
        return valorCita;
    }
    public void setValorCita(BigDecimal costoCita) {
        this.valorCita = costoCita;
    }
    public String getLugarCita() {
        return lugarCita;
    }
    public void setLugarCita(String lugarCita) {
        this.lugarCita = lugarCita;
    }
    public String getDiagnotico() {
        return diagnotico;
    }
    public void setDiagnotico(String diagnotico) {
        this.diagnotico = diagnotico;
    }
    public String getReceta() {
        return receta;
    }
    public void setReceta(String receta) {
        this.receta = receta;
    }
    public LocalDate getFechaProximaCita() {
        return fechaProximaCita;
    }
    public void setFechaProximaCita(LocalDate fechaProximaCita) {
        this.fechaProximaCita = fechaProximaCita;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPasciente(Paciente paciente) {
        this.paciente = paciente;
    }
    @Override
    public String toString() {
        return "CitaMedica [id=" + id + ", numeroCita=" + numeroCita + ", fechaCita=" + fechaCita + ", valorCita="
                + valorCita + ", lugarCita=" + lugarCita + ", diagnotico=" + diagnotico + ", receta=" + receta
                + ", fechaProximaCita=" + fechaProximaCita + ", doctor=" + doctor + ", paciente=" + paciente + "]";
    }
    

}
