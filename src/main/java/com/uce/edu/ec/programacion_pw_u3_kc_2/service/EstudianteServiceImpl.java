package com.uce.edu.ec.programacion_pw_u3_kc_2.service;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import com.uce.edu.ec.programacion_pw_u3_kc_2.repository.IEstudianteRespository;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.to.EstudianteTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteRespository estudianteRespository;

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        this.estudianteRespository.insertarEstudiante(estudiante);
    }

    @Override
    public Estudiante encontrarEstudiante(Integer id) {
        return this.estudianteRespository.buscarEstudiante(id);
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        this.estudianteRespository.actualizarEstudiante(estudiante);
    }

    @Override
    public void borrarEstudiante(Integer id) {
        this.estudianteRespository.borrarEstudiante(id);
    }

    @Override
    public List<Estudiante> buscarTodos() {
        return this.estudianteRespository.buscarTodos();
    }

    @Override
    public List<Estudiante> buscarTodosPorSalario(BigDecimal salario) {
        return this.estudianteRespository.buscarTodosPorSalario(salario);
    }

    @Override
    public List<EstudianteTo> buscarTodosTo() {
        List<Estudiante> lista = this.estudianteRespository.buscarTodos();
        List<EstudianteTo> listaFinal = lista.stream().map(this::convertir).toList();
        return listaFinal;
    }

    private EstudianteTo convertir(Estudiante estudiante){
        EstudianteTo estu = new EstudianteTo();
        estu.setId(estudiante.getId());
        estu.setNombre(estudiante.getNombre());
        estu.setApellido(estudiante.getApellido());
        estu.setFechaNacimiento(estudiante.getFechaNacimiento());
        return estu;
    }
}
