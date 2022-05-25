package com.portfolio.ProyectoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Hyss {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idhyss;
    
    private String nombre;
    private Integer porcentaje;
    
    public Hyss (){
        
    }
    
    public Hyss (Long idhyss, String nombre, Integer porcentaje) {
        this.idhyss = idhyss;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    
}
