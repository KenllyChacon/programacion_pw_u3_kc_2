package com.uce.edu.ec.programacion_pw_u3_kc_2.service;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Materia;
import com.uce.edu.ec.programacion_pw_u3_kc_2.repository.IMateriaRespository;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.to.MateriaTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MateriaServiceImpl implements IMateriaService{

    @Autowired
    private IMateriaRespository iMateriaRespository;

    @Override
    public List<MateriaTo> buscarPorEstudiante(Integer idEstudiante) {
        List<Materia> lista = this.iMateriaRespository.buscarPorEstudiante(idEstudiante);
//        return lista.stream().map(materia -> this.convertir(materia)).collect(Collectors.toList());
//        return lista.stream().map(this::convertir).toList();
        return null;
    }

    @Override
    public MateriaTo buscarMateria(Integer id) {
        return this.iMateriaRespository.buscarMateria(id);
    }


}
