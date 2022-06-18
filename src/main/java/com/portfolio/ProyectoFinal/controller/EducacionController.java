package com.portfolio.ProyectoFinal.controller;

import com.portfolio.ProyectoFinal.entity.Educacion;
import com.portfolio.ProyectoFinal.service.EducacionService;
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
public class EducacionController {
    
    @Autowired
    public EducacionService service;
    
    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion> obtenerEducacion() {
        return service.obtenerEducacion();
    }
    
    @PostMapping("/educacion/create")
    @ResponseBody
    public Educacion crearEducacion(@RequestBody Educacion educacion) {
        return service.crearEducacion(educacion);
    }
    
    @DeleteMapping("/educacion/{id}")
    public String borrarEducacion(@PathVariable Integer id) {
        service.borrarEducacion(id);
        return "El registro fue eliminado con éxito!";
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion obtenerEducacion(@PathVariable Integer id) {
        return service.obtenerEducacion(id);
    }
    
    @PutMapping("/educacion/update")
    public String modificarEducacion(@RequestBody Educacion educacion) {
        System.out.println(educacion);
        service.modificarEducacion(educacion);
        return "El registro fue modificado con éxito!";
    }
}
