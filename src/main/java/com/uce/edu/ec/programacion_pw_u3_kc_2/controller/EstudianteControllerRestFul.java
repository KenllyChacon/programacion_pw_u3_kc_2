package com.uce.edu.ec.programacion_pw_u3_kc_2.controller;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.IEstudianteService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {

    @Autowired
    private IEstudianteService iEstudianteService;

    @PostMapping
    public void insertarEstudiante(Estudiante estudiante) {
    }

    //estudiantes/buscar
    @GetMapping(path = "/{id}")
    public Estudiante buscarEstudiante(@PathVariable("id") Integer id) {
        return this.iEstudianteService.encontrarEstudiante(id);
    }

    @PutMapping(path = "/{id}")
    public void actualizarEstudiante(@PathVariable("id") Estudiante estudiante) {
    }

    @PutMapping
    public void actualizarTodos(Estudiante estudiante) {
    }

    @DeleteMapping(path = "{id}")
    public void borrarEstudiante(@PathVariable("id") Integer id) {
        this.iEstudianteService.borrarEstudiante(id);
    }

    @DeleteMapping
    public void borrarTodos(Integer id) {
    }

}
