package com.uce.edu.ec.programacion_pw_u3_kc_2.modelo;

import jakarta.persistence.*;

@Table(name = "materia")
@Entity
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mate_id")
    @SequenceGenerator(name= "seq_mate_id", sequenceName = "seq_mate_id", allocationSize = 1)
    @Column(name = "mate_id")
    private Integer id;

    @Column(name = "mate_nombre")
    private String nombre;

    @Column(name = "mate_creditos")
    private Integer creditos;

    @ManyToOne
    @JoinColumn(name = "mate_id_estudiantes")
    private Estudiante estudiante;

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

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
