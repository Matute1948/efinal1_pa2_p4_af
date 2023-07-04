package com.example.efinal1_pa2_p4_af;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.efinal1_pa2_p4_af.repository.modelo.CitaMedica;
import com.example.efinal1_pa2_p4_af.repository.modelo.Doctor;
import com.example.efinal1_pa2_p4_af.repository.modelo.Paciente;
import com.example.efinal1_pa2_p4_af.service.CitaMedicaService;
import com.example.efinal1_pa2_p4_af.service.DoctorService;
import com.example.efinal1_pa2_p4_af.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4AfApplication implements CommandLineRunner{
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private PacienteService pacienteService;
	@Autowired
	private CitaMedicaService citaMedicaService;
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Doctor doc1 = new Doctor();
		Paciente pas1 = new Paciente();

		doc1.setCedula("1724210680");
		doc1.setNombre("Ricardo");
		doc1.setApellido("Martinez");
		doc1.setFechaNacimento(LocalDate.of(1980, 12, 27));
		doc1.setNumeroConsultorio("0962965494");
		doc1.setCodigoSenescyt("09767");
		doc1.setGenero("Masculino");

		pas1.setCedula("1724210685");
		pas1.setNombre("Andres");
		pas1.setApellido("Lugmaña");
		pas1.setFechaNacimiento(LocalDate.of(2000, 7, 27));
		pas1.setCodigoSeguro("222");
		pas1.setEstatura(1.75);
		pas1.setPeso(73.3);
		pas1.setGenero("Masculino");

		this.doctorService.agregar(doc1);
		this.pacienteService.agregar(pas1);

		this.citaMedicaService.agendarPorParametros("034", LocalDate.of(2023, 1, 12), new BigDecimal(20), "Club de leones Sangolqui Parque turismo", "1724210680", "1724210685");
		this.citaMedicaService.actualizarPorParametros("034", "Reduccion de la fiebre en el paciente", "Seguir con los baños de agua templada e hidratacion", LocalDate.of(2023, 2, 24));		

	}

}
