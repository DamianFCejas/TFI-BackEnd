package com.portfolio.ProyectoFinal.controller;

import com.portfolio.ProyectoFinal.Interface.IHyss;
import com.portfolio.ProyectoFinal.entity.Hyss;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    
    @GetMapping ("/hyss")
    @ResponseBody
    public List<Hyss> verHyss (){
        return hyssServ.verHyss();
    }
    
    @PostMapping ("/hyss/create")
    @ResponseBody
    public ResponseEntity agregarHyss (@RequestBody Hyss hardyss) {
        hyssServ.crearHyss(hardyss);
        return new ResponseEntity(HttpStatus.CREATED);
    }          
        
    @DeleteMapping ("/hyss/{idhyss}")
    public void borrarHyss (@PathVariable Integer idhyss) {
    hyssServ.borrarHyss(idhyss);
    }
    
    @GetMapping("/hyss/{idhyss}")
    @ResponseBody
    public Hyss buscarHyss(@PathVariable Integer idhyss) {
        return hyssServ.buscarHyss(idhyss);
    }
    
    @PutMapping ("/hyss/update")
    public void modifHyss (@RequestBody Hyss hardyss) {
        System.out.println(hardyss);
        hyssServ.modifHyss(hardyss);
    }

    
}
