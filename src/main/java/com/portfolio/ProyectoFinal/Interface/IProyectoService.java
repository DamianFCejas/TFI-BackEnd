package com.portfolio.ProyectoFinal.Interface;

import com.portfolio.ProyectoFinal.entity.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> obtenerProyecto();
    public Proyecto crearProyecto(Proyecto proyecto);
    public void borrarProyecto(Integer id);
    public Proyecto obtenerProyecto(Integer id);
    public void modificarProyecto(Proyecto proyecto);
        
}
