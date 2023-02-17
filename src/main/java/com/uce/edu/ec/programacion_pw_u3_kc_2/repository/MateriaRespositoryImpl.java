package com.uce.edu.ec.programacion_pw_u3_kc_2.repository;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Materia;
import com.uce.edu.ec.programacion_pw_u3_kc_2.service.to.MateriaTo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class MateriaRespositoryImpl implements IMateriaRespository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Materia> buscarPorEstudiante(Integer idEstudiante) {
        //Buscar uno en especifico
        TypedQuery<Materia> miTypeQuery = this.entityManager.createQuery("select g from Materia g where g.estudiante.id =: idEstudiante",Materia.class);
        miTypeQuery.setParameter("idEstudiante", idEstudiante);
        return miTypeQuery.getResultList();

    }

    @Override
    public MateriaTo buscarMateria(Integer id) {
        return this.entityManager.find(MateriaTo.class, id);
    }

}
