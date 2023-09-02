package com.uce.efinal2_pa2_p4_al.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Materia;
import com.uce.efinal2_pa2_p4_al.service.IMateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
    @Autowired
    private IMateriaService materiaService;
    @GetMapping("/nuevo")
    public String paginaNuevaMateria(Materia materia){
        return "vistaNuevaMateria";
    }
    @PostMapping("/guardar")
    public String ingresarMateria(Materia materia){
        this.materiaService.agregar(materia);
        return "redirect:/materias/nuevo";
    }
}
