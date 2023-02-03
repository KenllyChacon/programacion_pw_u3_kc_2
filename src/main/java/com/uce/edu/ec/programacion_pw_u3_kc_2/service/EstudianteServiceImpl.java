package com.uce.edu.ec.programacion_pw_u3_kc_2.service;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import com.uce.edu.ec.programacion_pw_u3_kc_2.repository.IEstudianteRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
