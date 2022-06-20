package com.portfolio.ProyectoFinal.Interface;

import com.portfolio.ProyectoFinal.entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> obtenerExperiencia();
    public Experiencia crearExperiencia(Experiencia experiencia);
    public void borrarExperiencia(Integer id);
    public Experiencia obtenerExperiencia(Integer id);
    public void modificarExperiencia(Experiencia experiencia);
    
    
}
