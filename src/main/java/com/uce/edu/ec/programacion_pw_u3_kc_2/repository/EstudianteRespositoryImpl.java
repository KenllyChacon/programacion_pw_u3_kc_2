package com.uce.edu.ec.programacion_pw_u3_kc_2.repository;

import com.uce.edu.ec.programacion_pw_u3_kc_2.modelo.Estudiante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class EstudianteRespositoryImpl implements IEstudianteRespository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertarEstudiante(Estudiante estudiante) {
        this.entityManager.persist(estudiante);
    }

    @Override
    public Estudiante buscarEstudiante(Integer id) {
        return this.entityManager.find(Estudiante.class,id);
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        this.entityManager.merge(estudiante);
    }

    @Override
    public void borrarEstudiante(Integer id) {
        this.entityManager.remove(this.buscarEstudiante(id));
    }
}
