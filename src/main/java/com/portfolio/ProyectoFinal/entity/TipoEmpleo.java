package com.portfolio.ProyectoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TipoEmpleo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idtipoEmpleo;
    
    private String nombre;
    
    public TipoEmpleo (){
        }
    
    public TipoEmpleo (Long idtipoEmpleo, String nombre) {
        this.idtipoEmpleo = idtipoEmpleo;
        this.nombre = nombre;
    }
}
