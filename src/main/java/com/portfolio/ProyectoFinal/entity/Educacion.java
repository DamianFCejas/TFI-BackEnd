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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ideducacion")
    private Integer ideducacion;
    
    @Basic
    private String titulo;
    private boolean estudioFinalizado;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private String img;
    private String institucion;
    
    
    
    public Educacion() {
    }

    public Educacion(Integer idEducacion, String titulo, boolean estudioFinalizado, String fechaInicio, String fechaFin, String descripcion, String img, String institucion) {
        this.ideducacion = ideducacion;
        this.titulo = titulo;
        this.estudioFinalizado = estudioFinalizado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.img = img;
        this.institucion = institucion;
    }

    
    @Override
    public String toString() {
        return "Educacion{" + "ideducacion=" + ideducacion + ", titulo=" + titulo + ", estudioFinalizado=" + estudioFinalizado + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", descripcion=" + descripcion + ", img=" + img + ", institucion=" + institucion + '}';
    }

    
    
}
