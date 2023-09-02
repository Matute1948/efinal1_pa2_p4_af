package com.uce.efinal2_pa2_p4_al;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.efinal2_pa2_p4_al.repository.IEstudianteRepository;
import com.uce.efinal2_pa2_p4_al.service.IMateriaService;



@SpringBootApplication
public class Efinal2Pa2P4AlApplication implements CommandLineRunner {
	@Autowired
	private IMateriaService materiaService;
	@Autowired
	private IEstudianteRepository estudianteRepository;
	public static void main(String[] args) {
		SpringApplication.run(Efinal2Pa2P4AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.materiaService.buscarPorCodigo("Q101"));
		System.out.println(this.estudianteRepository.seleccionarPorCedula("1724210685"));
	}

}
