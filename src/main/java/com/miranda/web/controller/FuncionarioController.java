package com.miranda.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("funcionarios")
public class FuncionarioController {
    @GetMapping("/cadastrar")
    String cadastrar(){
        return("/funcionario/cadastro");
    }
    @GetMapping("/listar")
    String listar(){
        return("/funcionario/lista");
    }
}
