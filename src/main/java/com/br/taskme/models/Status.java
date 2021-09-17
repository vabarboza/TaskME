package com.br.taskme.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="status")
public class Status {
    
    @Id
    @Column(name="id_status")
    private int idStatus;
    
    @Column(name="desc_status")
    private String descStatus;

    public Status(int idStatus, String descStatus) {
        this.idStatus = idStatus;
        this.descStatus = descStatus;
    }

    public Status() {
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescStatus() {
        return descStatus;
    }

    public void setDescStatus(String descStatus) {
        this.descStatus = descStatus;
    }

    
}
