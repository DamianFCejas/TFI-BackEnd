package com.portfolio.ProyectoFinal.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
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
    private Integer idhyss;
    
    @Basic
    @Column(name="nombre")
    private String nombre;
    @Column(name="porcentaje")
    private Integer porcentaje;

    public Hyss() {
    }

    public Hyss(Integer idhyss, String nombre, Integer porcentaje) {
        this.idhyss = idhyss;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Hyss{" + "idhyss=" + idhyss + ", nombre=" + nombre + ", porcentaje=" + porcentaje + '}';
    }
    
        
    
}
