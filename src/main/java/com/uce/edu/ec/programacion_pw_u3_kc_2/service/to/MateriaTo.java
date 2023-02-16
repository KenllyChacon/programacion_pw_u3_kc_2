package com.uce.edu.ec.programacion_pw_u3_kc_2.service.to;

import jakarta.persistence.Column;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

public class MateriaTo extends RepresentationModel<MateriaTo> implements Serializable {

    private static final long serialVersionUID =  1L;

    private Integer id;
    private String nombre;
    private Integer creditos;

    //Set y get
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
}
