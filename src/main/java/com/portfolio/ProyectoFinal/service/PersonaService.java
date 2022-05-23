package com.portfolio.ProyectoFinal.service;

import com.portfolio.ProyectoFinal.Interface.IPersonaService;
import com.portfolio.ProyectoFinal.entity.Persona;
import com.portfolio.ProyectoFinal.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);                
    }
    
    @Override
    public void modifPersona(Persona person) {
        persoRepo.save(person);
    }
    
}
