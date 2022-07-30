package com.portfolio.ProyectoFinal.service;

import com.portfolio.ProyectoFinal.Interface.IProyectoService;
import com.portfolio.ProyectoFinal.entity.Proyecto;
import com.portfolio.ProyectoFinal.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository repository;

    @Override
    public List<Proyecto> obtenerProyecto() {
        return repository.findAll();
    }

    @Override
    public Proyecto crearProyecto(Proyecto proyecto) {
        return repository.save(proyecto);
    }

    @Override
    public void borrarProyecto(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Proyecto obtenerProyecto(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proyecto) {
        repository.save(proyecto);
    }
    
}
