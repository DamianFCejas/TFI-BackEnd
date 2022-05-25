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
    public String crearPersona(Persona per) {
        persoRepo.save(per);
        return "La persona fue creada con éxito!";
    }

    @Override
    public String borrarPersona(Long idpersona) {
        persoRepo.deleteById(idpersona);
        return "La persona fue eliminada con éxito!";
    }

    @Override
    public Persona buscarPersona(Long idpersona) {
        return persoRepo.findById(idpersona).orElse(null);                
    }
    
    @Override
    public String modifPersona(Persona person) {
        persoRepo.save(person);
        return "La persona fue modificada con éxito!";
    }
    
}
