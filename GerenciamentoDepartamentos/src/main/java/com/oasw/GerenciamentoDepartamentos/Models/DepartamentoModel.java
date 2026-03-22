package com.oasw.GerenciamentoDepartamentos.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_departemento")
public class DepartamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NumeroDepartamento")
    private Long id;
    private String nome;
    @Column(name = "LocalDepartamento")
    private String localizacao;

    public DepartamentoModel() {
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
