package com.uce.edu.ec.programacion_pw_u3_kc_2.controller;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.IEstudianteService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {

    @Autowired
    private IEstudianteService iEstudianteService;

    public void insertarEstudiante(Estudiante estudiante) {
    }

    //estudiantes/buscar
    @GetMapping(path = "/buscar/{id}")
    public Estudiante buscarEstudiante(@PathVariable("id") Integer id) {
        return this.iEstudianteService.encontrarEstudiante(id);
    }

    public void actualizarEstudiante(Estudiante estudiante) {
    }

    public void borrarEstudiante(Integer id) {
    }

}
