package com.project.rest.api.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuario")
public class UsuarioModel {
    @Column(nullable = false, length = 50)
    public String nome;
    @Column(nullable = false, length = 50, unique = true)
    public String email;
    @Column(nullable = false, length = 20, unique = true)
    @Id
    public Long cpf;
    @Column(nullable = false, length = 30)
    public String dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) { this.cpf = cpf; }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
