package com.uce.edu.ec.programacion_pw_u3_kc_2.service.to;

import java.io.Serializable;

/**
 * A DTO for the {@link com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante} entity
 */
public class EstudianteDto implements Serializable {
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}