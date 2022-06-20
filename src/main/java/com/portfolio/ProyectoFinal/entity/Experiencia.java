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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idexperiencia")
    private Integer idexperiencia;
    
    @Basic
    @Column(name="esTrabajoActual")
    private boolean esTrabajoActual;
    @Column(name="fechaInicio")
    private String fechaInicio;
    @Column(name="fechaFin")
    private String fechaFin;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="tipoEmpleo")
    private String tipoEmpleo;
    @Column(name="empresa")
    private String empresa;

    public Experiencia() {
    }

    public Experiencia(Integer idexperiencia, boolean esTrabajoActual, String fechaInicio, String fechaFin, String descripcion, String tipoEmpleo, String empresa) {
        this.idexperiencia = idexperiencia;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.tipoEmpleo = tipoEmpleo;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "idexperiencia=" + idexperiencia + ", esTrabajoActual=" + esTrabajoActual + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", descripcion=" + descripcion + ", tipoEmpleo=" + tipoEmpleo + ", empresa=" + empresa + '}';
    }
    
    
    
}
