package com.uce.edu.ec.programacion_pw_u3_kc_2.service.to;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Materia;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class EstudianteTo extends RepresentationModel<EstudianteTo> implements Serializable {

    private static final long serialVersionUID =1L;

    private Integer id;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;

    //Metodos get y set
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
