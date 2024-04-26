package com.miranda.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
    @GetMapping("/cadastrar")
    String cadastrar(){
        return("/departamento/cadastro");
    }
    @GetMapping("/listar")
    String listar(){
        return("/departamento/lista");
    }
}
