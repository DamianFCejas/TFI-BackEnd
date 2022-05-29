package com.portfolio.ProyectoFinal.service;

import com.portfolio.ProyectoFinal.entity.User;
import com.portfolio.ProyectoFinal.model.dto.UserDto;
import com.portfolio.ProyectoFinal.repository.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserDao repository;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    public boolean isUserEnabled(UserDto userDto) {
        boolean isUserEnabled = false;
        List<User> usuarios = repository.findByUsernameAndIsEnabledTrue(userDto.getUsername());
        if (!usuarios.isEmpty()) {
            User usuario = usuarios.get(0);
            if (passwordEncoder.matches(userDto.getPassword(), usuario.getPassword()))
                isUserEnabled = true;
        }
        
        return isUserEnabled;
    }
    
    public void crearUsuario(User usuario) throws Exception {
        List<User> usuarios = repository.findByUsernameAndIsEnabledTrue(usuario.getUsername());
        if(!usuarios.isEmpty()){
            throw new Exception("El usuario ya está registrado!");
        } else {
        
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuario.setEnabled(true);
        repository.save(usuario);
        }
    
    }
}