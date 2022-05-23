package com.portfolio.ProyectoFinal.Interface;

import com.portfolio.ProyectoFinal.entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
    public void modifPersona (Persona per);
    
}
