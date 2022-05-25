package com.portfolio.ProyectoFinal.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idpersona;
    
    private String nombre;
    private String apellido;
    private String domicilio;
    private String fechaNac;
    private String telefono;
    private String correo;
    private String sobreMi;
    private String urlFoto;
    
    
    public Persona () {
    }
    
    public Persona (Long idpersona, String nombre, String apellido, String domicilio,
            String fechaNac, String telefono, String correo, String sobreMi, String urlFoto) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.correo = correo;
        this.sobreMi = sobreMi;
        this.urlFoto = urlFoto;
    }
}
