package com.project.rest.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping(path = "/api/usuario/{cpf}")
    public ResponseEntity consultar(@PathVariable("cpf")String cpf) {
        return null;
    }
}
