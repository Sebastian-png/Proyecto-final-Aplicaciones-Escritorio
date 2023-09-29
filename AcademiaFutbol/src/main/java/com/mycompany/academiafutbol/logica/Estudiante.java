package com.mycompany.academiafutbol.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Estudiante implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_estudiante;
    private String nombre;
    private String ciudad;
    private String edad;
    private String genero;
    private String categoria;
    private String valor_mes;
    private String meses_atrasados;
    @OneToOne
    private Responsable unResponsable;

    public Estudiante() {
    }

    public Estudiante(int id_estudiante, String nombre, String ciudad, String edad, String genero, String categoria, String valor_mes, String meses_atrasados, Responsable unResponsable) {
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
        this.genero = genero;
        this.categoria = categoria;
        this.valor_mes = valor_mes;
        this.meses_atrasados = meses_atrasados;
        this.unResponsable = unResponsable;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValor_mes() {
        return valor_mes;
    }

    public void setValor_mes(String valor_mes) {
        this.valor_mes = valor_mes;
    }

    public String getMeses_atrasados() {
        return meses_atrasados;
    }

    public void setMeses_atrasados(String meses_atrasados) {
        this.meses_atrasados = meses_atrasados;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    

    
    
}
