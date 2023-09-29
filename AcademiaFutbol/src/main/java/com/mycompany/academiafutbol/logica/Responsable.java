package com.mycompany.academiafutbol.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Responsable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_padre;
    private String nombre;
    private String celular;
    private String corElec;

    public Responsable() {
    }

    public Responsable(int id_padre, String nombre, String celular, String corElec) {
        this.id_padre = id_padre;
        this.nombre = nombre;
        this.celular = celular;
        this.corElec = corElec;
    }

    public int getId_padre() {
        return id_padre;
    }

    public void setId_padre(int id_padre) {
        this.id_padre = id_padre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorElec() {
        return corElec;
    }

    public void setCorElec(String corElec) {
        this.corElec = corElec;
    }
    
}
