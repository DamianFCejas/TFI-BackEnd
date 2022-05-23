package com.portfolio.ProyectoFinal.controller;

import com.portfolio.ProyectoFinal.Interface.IPersonaService;
import com.portfolio.ProyectoFinal.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{idpersona}")
    public void borrarPersona (@PathVariable Long idpersona) {
        persoServ.borrarPersona(idpersona);
        
    }
    
    @PutMapping ("/put/persona")
    public void modifPersona (@RequestBody Persona perso) {
        persoServ.modifPersona(perso);
    }
    
}
