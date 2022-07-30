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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idproyecto")
    private Integer idproyecto;
    
    @Basic
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="urlFoto")
    private String urlFoto;

    public Proyecto() {
    }

    public Proyecto(Integer idproyecto, String nombre, String descripcion, String urlFoto) {
        this.idproyecto = idproyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idproyecto=" + idproyecto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", urlFoto=" + urlFoto + '}';
    }
    
    
    
}
