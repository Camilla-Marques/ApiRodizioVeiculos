package com.project.rest.api.controller;

import com.project.rest.api.model.UsuarioModel;
import com.project.rest.api.repository.UsuarioRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRespository repository;

    @GetMapping(path = "/api/usuario/{cpf}")
    public ResponseEntity consultar(@PathVariable("cpf") Long cpf) {
        return repository.findById(cpf)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario) {
        return repository.save(usuario);
    }
}
