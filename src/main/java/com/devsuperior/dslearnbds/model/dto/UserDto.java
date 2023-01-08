package com.devsuperior.dslearnbds.model.dto;

import com.devsuperior.dslearnbds.model.entity.User;

import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID= 1L;

    private Long id;
    private String nome;
    private String email;
    private String password;

    public UserDto() {
    }

    public UserDto(Long id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public UserDto(User entity){
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.email = entity.getEmail();
        this.password = entity.getPassword();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
