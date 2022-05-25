package com.portfolio.ProyectoFinal.repository;

import com.portfolio.ProyectoFinal.entity.Hyss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HyssRepository extends JpaRepository<Hyss, Long>{
    
}
