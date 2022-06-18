package com.portfolio.ProyectoFinal.service;

import com.portfolio.ProyectoFinal.Interface.IEducacionService;
import com.portfolio.ProyectoFinal.entity.Educacion;
import com.portfolio.ProyectoFinal.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository repository;

    @Override
    public List<Educacion> obtenerEducacion() {
        return repository.findAll();
    }

    @Override
    public Educacion crearEducacion(Educacion educacion) {
        return repository.save(educacion);
    }

    @Override
    public void borrarEducacion(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Educacion obtenerEducacion(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion educacion) {
        repository.save(educacion);
    }
    
}
