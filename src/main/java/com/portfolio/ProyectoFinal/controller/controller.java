package com.portfolio.ProyectoFinal.controller;

import com.portfolio.ProyectoFinal.Interface.IPersonaService;
import com.portfolio.ProyectoFinal.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/persona/new")
    public String crearPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "La persona fue creada con éxito!";
    }
    
    @GetMapping ("/persona/ver")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{idpersona}")
    public String borrarPersona (@PathVariable Long idpersona) {
        persoServ.borrarPersona(idpersona);
        return "La persona fue eliminada con éxito!";
        
    }
    
    @PutMapping ("/persona/put")
    public String modifPersona (@RequestBody Persona perso) {
        persoServ.modifPersona(perso);
        return "La persona fue modificada con éxito!";
    }
    
    @GetMapping ("/persona/perfil"/*si se pone id cambiante puede ser: "/persona/{idpersona}*/)
    public Persona buscarPersona(/*con id cambiante se debe agregar acá: @PathVariable Long idpersona*/){
        return persoServ.buscarPersona((long)1/*con id cambiante se debe agregar acá: idpersona*/);
    }
    
}
