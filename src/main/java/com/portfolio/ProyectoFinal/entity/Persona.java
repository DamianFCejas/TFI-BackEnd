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
    private String telefono;
    private String correo;
    private String sobreMi;
    private String puesto;
    private String urlFoto; //Foto de Perfil
    private String urlLd;
    private String urlQrLd;
    private String urlGithub;
    private String urlFotoBanner;
    private String urlAP;
    private String urlFotoAP;
    private String urlLogin;
    private String urlLogoPortfolio;
    private String urlFotoContacto;
    
    
    
    
    public Persona () {
    }

    public Persona(Long idpersona, String nombre, String apellido, String domicilio, String telefono, String correo, String sobreMi, String puesto, String urlFoto, String urlLd, String urlQrLd, String urlGithub, String urlFotoBanner, String urlAP, String urlFotoAP, String urlLogin, String urlLogoPortfolio, String urlFotoContacto) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
        this.sobreMi = sobreMi;
        this.puesto = puesto;
        this.urlFoto = urlFoto;
        this.urlLd = urlLd;
        this.urlQrLd = urlQrLd;
        this.urlGithub = urlGithub;
        this.urlFotoBanner = urlFotoBanner;
        this.urlAP = urlAP;
        this.urlFotoAP = urlFotoAP;
        this.urlLogin = urlLogin;
        this.urlLogoPortfolio = urlLogoPortfolio;
        this.urlFotoContacto = urlFotoContacto;
    }
}
