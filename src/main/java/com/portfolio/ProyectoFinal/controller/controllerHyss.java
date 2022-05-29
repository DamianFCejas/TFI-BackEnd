package com.portfolio.ProyectoFinal.controller;

import com.portfolio.ProyectoFinal.Interface.IHyss;
import com.portfolio.ProyectoFinal.entity.Hyss;
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
public class controllerHyss {
    
    @Autowired
    private IHyss hyssServ;
    
    @PostMapping ("/hyss/new")
    public String agregarHyss (@RequestBody Hyss hardyss) {
    hyssServ.crearHyss(hardyss);
    return "La habilidad fue creada con éxito!";
    }
    
    @GetMapping ("/hyss/ver")
    @ResponseBody
    public List<Hyss> verHyss (){
    return hyssServ.verHyss();
    }
    
    @DeleteMapping ("/hyss/delete/{idhyss}")
    public String borrarHyss (@PathVariable Long idhyss) {
    hyssServ.borrarHyss(idhyss);
    return "La habilidad fue eliminada con éxito!";
    }
    
    @PutMapping ("/hyss/put")
    public String modifHyss (@RequestBody Hyss hardyss) {
        hyssServ.modifHyss(hardyss);
    return "La habilidad fue modificada con éxito!";
    }

    
}
