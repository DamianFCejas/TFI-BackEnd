package com.portfolio.ProyectoFinal.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter @Setter
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    
    @Basic
    @Column(name="username")
    private String username;
    
    @Column(name="password")
    private String password;

    @Column(name="email", length = 100)
    private String email;
    
    @Column(name = "is_enabled")
    private boolean isEnabled;

    public User() {
    }

    public User(String username, String password, String email, boolean isEnabled) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", isEnabled=" + isEnabled + '}';
    }
    
    
}
