package com.uce.edu.ec.programacion_pw_u3_kc_2.service;
import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;

public interface IEstudianteService {

    void registrarEstudiante(Estudiante estudiante);
    Estudiante encontrarEstudiante(Integer id);
    void actualizarEstudiante(Estudiante estudiante);
    void borrarEstudiante(Integer id);

}
