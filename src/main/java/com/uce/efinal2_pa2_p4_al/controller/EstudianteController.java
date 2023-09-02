package com.uce.efinal2_pa2_p4_al.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Estudiante;
import com.uce.efinal2_pa2_p4_al.service.IEstudianteService;
@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private IEstudianteService estudianteService;
    @GetMapping("/nuevo")
    public String paginaNuevaEstudiante(Estudiante estudiante){
        return "vistaNuevoEstudiante";
    }
    @PostMapping("/guardar")
    public String ingresarEstudiante(Estudiante estudiante){
        this.estudianteService.agregar(estudiante);
        return "redirect:/estudiantes/nuevo";
    }
}
