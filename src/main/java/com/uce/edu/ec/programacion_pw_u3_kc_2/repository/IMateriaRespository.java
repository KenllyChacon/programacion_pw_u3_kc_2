package com.uce.edu.ec.programacion_pw_u3_kc_2.repository;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Materia;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.to.MateriaTo;

import java.util.List;

public interface IMateriaRespository {

    List<Materia> buscarPorEstudiante(Integer idEstudiante);
    MateriaTo buscarMateria(Integer id);

}
