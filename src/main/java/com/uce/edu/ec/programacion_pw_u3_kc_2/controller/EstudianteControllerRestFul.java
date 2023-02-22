package com.uce.edu.ec.programacion_pw_u3_kc_2.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.IEstudianteService;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.IMateriaService;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.to.EstudianteTo;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.to.MateriaTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {

    @Autowired
    private IEstudianteService iEstudianteService;

    @Autowired
    private IMateriaService iMateriaService;

    @PostMapping
    public void insertarEstudiante(@RequestBody Estudiante estudiante) {
        this.iEstudianteService.registrarEstudiante(estudiante);
    }

    //estudiantes/buscar
    @GetMapping(path = "/{id}", produces = (MediaType.APPLICATION_XML_VALUE))
    public Estudiante buscarEstudiante(@PathVariable("id") Integer id) {
        return this.iEstudianteService.encontrarEstudiante(id);
    }

    /*@GetMapping
    public ResponseEntity<List<Estudiante>> buscarTodos() {
        HttpHeaders cabeceras = new HttpHeaders();
        cabeceras.add("detalleMensaje", "Estudiante encontrado correctamente");
        cabeceras.add("valorCalculado", "100");
        List<Estudiante> lista = this.iEstudianteService.buscarTodos();
        return new ResponseEntity<>(lista,cabeceras,230);
    }*/

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EstudianteTo> buscarTodosHateoas() {
        List<EstudianteTo> lista = this.iEstudianteService.buscarTodosTo();
        for (EstudianteTo estu:lista){
            Link miLink = linkTo(methodOn(EstudianteControllerRestFul.class).buscarMaterias(estu.getId())).withRel("materias");
            Link miLink2 = linkTo(methodOn(EstudianteControllerRestFul.class).buscarEstudiante(estu.getId())).withSelfRel();
            Link miLink3 = linkTo(EstudianteControllerRestFul.class).slash("prueba").slash("estudiante").slash(estu.getId()).withRel("enlacePrueba");
            estu.add(miLink);
            estu.add(miLink2);
            estu.add(miLink3);

        }
        return lista;
    }


    @GetMapping(path = "/{idEstudiante}/materias", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MateriaTo> buscarMaterias(@PathVariable("idEstudiante") Integer idEstudiante){
      /*  Link miLink = linkTo(methodOn(EstudianteControllerRestFul.class).iMateriaService.buscarMateria(idEstudiante))
        materia = this.iMateriaService.buscarPorEstudiante(idEstudiante);
        materia.add(miLink);*/
        return this.iMateriaService.buscarPorEstudiante(idEstudiante);
    }



    @GetMapping(path = "/salario")
    public List<Estudiante> buscarTodosPorSalario(@RequestParam("salario") BigDecimal salario) {
        return this.iEstudianteService.buscarTodosPorSalario(salario);
    }


    @PutMapping(path = "/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Estudiante> actualizarEstudiante(@PathVariable("id") Integer id, @RequestBody Estudiante estudiante, @RequestParam String provincia) {
        estudiante.setId(id);
        this.iEstudianteService.actualizarEstudiante(estudiante);
        Estudiante est = this.iEstudianteService.encontrarEstudiante(id);
        return ResponseEntity.status(HttpStatus.OK).body(est);
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
