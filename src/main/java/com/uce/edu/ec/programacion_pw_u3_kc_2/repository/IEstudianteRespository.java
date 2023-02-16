package com.uce.edu.ec.programacion_pw_u3_kc_2.repository;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.to.EstudianteTo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

public interface IEstudianteRespository {

    void insertarEstudiante(Estudiante estudiante);
    Estudiante buscarEstudiante(Integer id);
    void actualizarEstudiante(Estudiante estudiante);
    void borrarEstudiante(Integer id);

    List<Estudiante> buscarTodos();
    List<Estudiante> buscarTodosPorSalario(BigDecimal salario);

}
