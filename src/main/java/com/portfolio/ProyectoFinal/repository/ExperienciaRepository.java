package com.portfolio.ProyectoFinal.repository;

import com.portfolio.ProyectoFinal.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    
}
