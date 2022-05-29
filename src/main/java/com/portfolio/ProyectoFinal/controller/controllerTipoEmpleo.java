package com.portfolio.ProyectoFinal.controller;

import com.portfolio.ProyectoFinal.Interface.ITipoEmpleo;
import com.portfolio.ProyectoFinal.entity.TipoEmpleo;
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
public class controllerTipoEmpleo {
    
    @Autowired
    private ITipoEmpleo tipoEmServ;
    
    @PostMapping ("/tipoempleo/new")
    public String agregarTipoEmpleo (@RequestBody TipoEmpleo tipoEm) {
    tipoEmServ.crearTipoEmpleo(tipoEm);
    return "El tipo de empleo fue creado con éxito!";
    }
    
    @GetMapping ("/tipoempleo/ver")
    @ResponseBody
    public List<TipoEmpleo> verTipoEmpleo (){
    return tipoEmServ.verTipoEmpleo();
    }
    
    @DeleteMapping ("/tipoempleo/delete/{idtipoempleo}")
    public String borrarTipoEmpleo (@PathVariable Long idtipoempleo) {
        tipoEmServ.borrarTipoEmpleo(idtipoempleo);
        return "El tipo de empleo fue eliminado con éxito!";
        
    }
    
    @PutMapping ("/tipoempleo/put")
    public String modifTipoEmpleo (@RequestBody TipoEmpleo tipoEm) {
        tipoEmServ.modifTipoEmpleo(tipoEm);
        return "El tipo de empleo fue modificado con éxito!";
    }

    
}
