package com.br.taskme.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @Column(name="id_user")
    private int idUser;
    
    @Column(name="nome_user")
    private String nomeUser;
    
    @Column(name="email_user")
    private String emailUser;
    
    @Column(name="senha_user")
    private String senhaUser;
    
    @Column(name="tel_user")
    private String foneUser;
    
    @Column(name="ativo_user")
    private int ativo;

    public Usuario(int idUser, String nomeUser, String emailUser, String senhaUser, String foneUser, int ativo) {
        this.idUser = idUser;
        this.nomeUser = nomeUser;
        this.emailUser = emailUser;
        this.senhaUser = senhaUser;
        this.foneUser = foneUser;
        this.ativo = ativo;
    }

    public Usuario() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getSenhaUser() {
        return senhaUser;
    }

    public void setSenhaUser(String senhaUser) {
        this.senhaUser = senhaUser;
    }

    public String getFoneUser() {
        return foneUser;
    }

    public void setFoneUser(String foneUser) {
        this.foneUser = foneUser;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    
}
