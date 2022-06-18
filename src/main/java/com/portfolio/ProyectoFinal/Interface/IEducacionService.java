package com.portfolio.ProyectoFinal.Interface;

import com.portfolio.ProyectoFinal.entity.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion> obtenerEducacion();
    public Educacion crearEducacion(Educacion educacion);
    public void borrarEducacion(Integer id);
    public Educacion obtenerEducacion(Integer id);
    public void modificarEducacion(Educacion educacion);
    
}
