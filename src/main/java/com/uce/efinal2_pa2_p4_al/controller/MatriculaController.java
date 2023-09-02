package com.uce.efinal2_pa2_p4_al.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uce.efinal2_pa2_p4_al.repository.modelo.Matricula;
import com.uce.efinal2_pa2_p4_al.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private IMatriculaService matriculaService;
    
    @GetMapping("/nuevo")
    public String paginaNuevaEstudiante(Matricula matricula){
        return "vistaNuevaMatricula";
    }
     
    @PostMapping("/guardar")
    public String insertarInventario(@RequestParam("cedula")String cedula,
                                    @RequestParam("codigo1")String codigo1,
                                    @RequestParam("codigo2")String codigo2,
                                    @RequestParam("codigo3")String codigo3,
                                    @RequestParam("codigo4")String codigo4){
        this.matriculaService.insertar(cedula, codigo1, codigo2, codigo3, codigo4);
        return "redirect:/matriculas/nuevo";
    }
    

}
