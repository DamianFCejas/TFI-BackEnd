package com.portfolio.ProyectoFinal.Interface;

import com.portfolio.ProyectoFinal.entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    
    public String crearPersona (Persona per);
    
    public String borrarPersona (Long idpersona);
    
    public Persona buscarPersona (Long idpersona);
    
    public String modifPersona (Persona per);
    
}
