
package com.portfolio.ProyectoFinal.repository;

import com.portfolio.ProyectoFinal.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
