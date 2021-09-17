package com.br.taskme.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tarefa")
public class Tarefa {
    @Id
    @Column(name="id_tarefa")
    private int idTarefa;
    
    @Column(name="titulo_tarefa")
    private String tituloTarefa;
    
    @Column(name="desc_tarefa")
    private String descTarefa;
    
    @Column(name="datainicio_tarefa")
    private Date dataInicioTarefa;
    
    @Column(name="datafinal_tarefa")
    private Date dataFinalTarefa;
    
    @OneToOne
    @JoinColumn(name="status_tarefa", referencedColumnName = "id_status")
    private Status status;
    
    @OneToOne
    @JoinColumn(name="categoria_tarefa", referencedColumnName = "id_categoria")
    private Categoria categoria;
    
    @OneToOne
    @JoinColumn(name="prioridade_tarefa", referencedColumnName = "id_prioridade")
    private Prioridade prioridade;
    
    @OneToOne
    @JoinColumn(name="usuario_tarefa", referencedColumnName = "id_user")
    private Usuario user;

    public Tarefa(int idTarefa, String tituloTarefa, String descTarefa, Date dataInicioTarefa, 
            Date dataFinalTarefa, Status status, Categoria categoria, Prioridade prioridade, Usuario user) {
        this.idTarefa = idTarefa;
        this.tituloTarefa = tituloTarefa;
        this.descTarefa = descTarefa;
        this.dataInicioTarefa = dataInicioTarefa;
        this.dataFinalTarefa = dataFinalTarefa;
        this.status = status;
        this.categoria = categoria;
        this.prioridade = prioridade;
        this.user = user;
    }

    public Tarefa() {
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getTituloTarefa() {
        return tituloTarefa;
    }

    public void setTituloTarefa(String tituloTarefa) {
        this.tituloTarefa = tituloTarefa;
    }

    public String getDescTarefa() {
        return descTarefa;
    }

    public void setDescTarefa(String descTarefa) {
        this.descTarefa = descTarefa;
    }

    public Date getDataInicioTarefa() {
        return dataInicioTarefa;
    }

    public void setDataInicioTarefa(Date dataInicioTarefa) {
        this.dataInicioTarefa = dataInicioTarefa;
    }

    public Date getDataFinalTarefa() {
        return dataFinalTarefa;
    }

    public void setDataFinalTarefa(Date dataFinalTarefa) {
        this.dataFinalTarefa = dataFinalTarefa;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    
    
    
    
    
}
