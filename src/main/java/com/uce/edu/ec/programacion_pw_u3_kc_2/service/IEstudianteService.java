package com.uce.edu.ec.programacion_pw_u3_kc_2.service;
import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.to.EstudianteTo;

import java.math.BigDecimal;
import java.util.List;

public interface IEstudianteService {

    void registrarEstudiante(Estudiante estudiante);
    Estudiante encontrarEstudiante(Integer id);
    void actualizarEstudiante(Estudiante estudiante);
    void borrarEstudiante(Integer id);

    List<Estudiante> buscarTodos();
    List<Estudiante> buscarTodosPorSalario(BigDecimal salario);
    List<EstudianteTo> buscarTodosTo();
}
