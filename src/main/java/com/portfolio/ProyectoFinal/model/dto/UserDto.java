package com.portfolio.ProyectoFinal.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto {
    private String username;
    private String password;
    private String email;
        
    public UserDto(){
        
    }

    @Override
    public String toString() {
        return "UserDto{" + "username=" + username + ", password=" + password + ", email=" + email + '}';
    }
    
    
    public UserDto(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
}
