package com.example.efinal1_pa2_p4_af.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "doctor")
@Entity
public class Doctor {
    @GeneratedValue(generator = "seq_doctor", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor",allocationSize = 1)
    @Id
    @Column(name = "doct_id")
    private Integer id;
    @Column(name = "doct_cedula")
    private String cedula;
    @Column(name = "doct_nombre")
    private String nombre;
    @Column(name = "doct_apellido")
    private String apellido;
    @Column(name = "doct_fecha_nacimiento")
    private LocalDate fechaNacimento;
    @Column(name = "doct_numero_consultorio")
    private String numeroConsultorio;
    @Column(name = "doct_codigo_senescyt")
    private String codigoSenescyt;
    @Column(name = "doct_genero")
    private String genero;
    @OneToMany(mappedBy = "doctor")
    private List<CitaMedica> citaMedica;
    //get y set
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDate getFechaNacimento() {
        return fechaNacimento;
    }
    public void setFechaNacimento(LocalDate fechaNacimento) {
        this.fechaNacimento = fechaNacimento;
    }
    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }
    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }
    public String getCodigoSenescyt() {
        return codigoSenescyt;
    }
    public void setCodigoSenescyt(String codigoSenescyt) {
        this.codigoSenescyt = codigoSenescyt;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public List<CitaMedica> getCitaMedica() {
        return citaMedica;
    }
    public void setCitaMedica(List<CitaMedica> citaMedica) {
        this.citaMedica = citaMedica;
    }
    //toString
    @Override
    public String toString() {
        return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
                + ", fechaNacimento=" + fechaNacimento + ", numeroConsultorio=" + numeroConsultorio
                + ", codigoSenescyt=" + codigoSenescyt + ", genero=" + genero + ", citaMedica=" + citaMedica + "]";
    }

    

     

    
        
    
   
    
    
   

    

    

    


}
