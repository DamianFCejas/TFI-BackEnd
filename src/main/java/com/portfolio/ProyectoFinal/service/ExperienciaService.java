package com.portfolio.ProyectoFinal.service;

import com.portfolio.ProyectoFinal.Interface.IExperienciaService;
import com.portfolio.ProyectoFinal.entity.Experiencia;
import com.portfolio.ProyectoFinal.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository repository;

    @Override
    public List<Experiencia> obtenerExperiencia() {
        return repository.findAll();
    }

    @Override
    public Experiencia crearExperiencia(Experiencia experiencia) {
        return repository.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Experiencia obtenerExperiencia(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencia experiencia) {
        repository.save(experiencia);
    }
    
}
