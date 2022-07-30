package com.portfolio.ProyectoFinal.repository;

import com.portfolio.ProyectoFinal.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>{
    
}
