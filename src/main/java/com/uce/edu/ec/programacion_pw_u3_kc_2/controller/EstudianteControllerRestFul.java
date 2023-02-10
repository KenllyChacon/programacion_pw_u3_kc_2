package com.uce.edu.ec.programacion_pw_u3_kc_2.controller;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.IEstudianteService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {

    @Autowired
    private IEstudianteService iEstudianteService;

    @PostMapping
    public void insertarEstudiante(@RequestBody Estudiante estudiante) {
        this.iEstudianteService.registrarEstudiante(estudiante);
    }

    //estudiantes/buscar
    @GetMapping(path = "/{id}")
    public Estudiante buscarEstudiante(@PathVariable("id") Integer id) {
        return this.iEstudianteService.encontrarEstudiante(id);
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> buscarTodos() {
        HttpHeaders cabeceras = new HttpHeaders();
        cabeceras.add("detalleMensaje", "Estudiante encontrado correctamente");
        cabeceras.add("valorCalculado", "100");
        List<Estudiante> lista = this.iEstudianteService.buscarTodos();
        return new ResponseEntity<>(lista,cabeceras,230);
    }

    @GetMapping(path = "/salario")
    public List<Estudiante> buscarTodosPorSalario(@RequestParam("salario") BigDecimal salario) {
        return this.iEstudianteService.buscarTodosPorSalario(salario);
    }


    @PutMapping(path = "/{id}")
    public void actualizarEstudiante(@PathVariable("id") Integer id, @RequestBody Estudiante estudiante,@RequestParam("provincia") String provincia) {
        System.out.println(provincia);
        estudiante.setId(id);
        this.iEstudianteService.actualizarEstudiante(estudiante);
    }

    @PutMapping
    public void actualizarTodos() {
    }

    @DeleteMapping(path = "{id}")
    public void borrarEstudiante(@PathVariable("id") Integer id) {
        this.iEstudianteService.borrarEstudiante(id);
    }

    @PostMapping(path = "/borrar/{id}")
    public void borrarTemp(@PathVariable("id") Integer id) {
        this.iEstudianteService.borrarEstudiante(id);
    }

    @DeleteMapping
    public void borrarTodos() {
    }

}
