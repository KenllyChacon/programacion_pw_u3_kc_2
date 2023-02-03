package com.uce.edu.ec.programacion_pw_u3_kc_2.repository;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

public interface IEstudianteRespository {

    void insertarEstudiante(Estudiante estudiante);
    Estudiante buscarEstudiante(Integer id);
    void actualizarEstudiante(Estudiante estudiante);
    void borrarEstudiante(Integer id);

}
