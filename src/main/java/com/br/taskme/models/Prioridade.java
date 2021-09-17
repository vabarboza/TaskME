package com.br.taskme.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prioridade")
public class Prioridade {
    
    @Id
    @Column(name="id_prioridade")
    private int idPrioridade;
    
    @Column(name="nome_prioridade")
    private String nomePrioridade;

    public Prioridade(int idPrioridade, String nomePrioridade) {
        this.idPrioridade = idPrioridade;
        this.nomePrioridade = nomePrioridade;
    }

    public Prioridade() {
    }

    public int getIdPrioridade() {
        return idPrioridade;
    }

    public void setIdPrioridade(int idPrioridade) {
        this.idPrioridade = idPrioridade;
    }

    public String getNomePrioridade() {
        return nomePrioridade;
    }

    public void setNomePrioridade(String nomePrioridade) {
        this.nomePrioridade = nomePrioridade;
    }
    
    
}
