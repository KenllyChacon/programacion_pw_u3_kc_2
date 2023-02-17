package com.uce.edu.ec.programacion_pw_u3_kc_2.service;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Materia;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.to.MateriaTo;

import java.util.List;

public interface IMateriaService {
    List<MateriaTo> buscarPorEstudiante(Integer idEstudiante);
    MateriaTo buscarMateria(Integer id);
}
