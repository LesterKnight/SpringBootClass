package com.miranda.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cargos")
public class CargoController {
    @GetMapping("/cadastrar")
    String cadastrar(){
        return("/cargo/cadastro");
    }
    @GetMapping("/listar")
    String listar(){
        return("/cargo/lista");
    }
}
