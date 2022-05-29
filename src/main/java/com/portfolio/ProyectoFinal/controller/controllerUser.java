package com.portfolio.ProyectoFinal.controller;

import com.portfolio.ProyectoFinal.entity.User;
import com.portfolio.ProyectoFinal.model.dto.UserDto;
import com.portfolio.ProyectoFinal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import com.portfolio.ProyectoFinal.repository.UserDao;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerUser {
    
    @Autowired
    UserService service;
    
    @PostMapping("/api/user/login")
    @ResponseBody
    public boolean login(@RequestBody UserDto userDto) {
        return service.isUserEnabled(userDto);
    }
    
    //Se activa la siguiente ruta temporalmente para la carga de los usuarios, luego se deshabilita. Se realiza la carga de éste modo para poder guardar encriptado el password en la base de datos.
    @PostMapping("/api/user/register")
    public void register(@RequestBody User usuario) throws Exception {
        service.crearUsuario(usuario);
    }
    
    
    /*
    @Autowired
    private UserDao UserDao;
    
    @GetMapping("/api/user/{id}")
    @ResponseBody
    public User usuario(@PathVariable Integer id){
        return (UserDao.findById(id).get());
    }
    
    @GetMapping("/api/user/username")
    @ResponseBody
    public User usuario(){
        return (UserDao.findByUsername("User"));
    }
    
    
    @PostMapping("/api/user/login")
    @ResponseBody
    public User login(@RequestBody User us) {
        return (UserDao.findByUsernameAndPassword(us.getUsername(), us.getPassword()));
    }
    
    
    @PostMapping("/api/user/add")
    public void newUser(@RequestBody User u){
        UserDao.save(u);
    }
    
    @PutMapping("/api/user/edit")
    public void editUser(@RequestBody User u) {
        UserDao.save(u);
    }
    
    @DeleteMapping("/api/user/delete/{id}")
    public void deleteUser(@PathVariable Integer id) {
        UserDao.deleteById(id);
    }
    
    /*
    Sin trabajar con la URL para borrar:
    @DeleteMapping("/api/user/delete")
    public void editUser(@RequestBody User u) {
        UserDao.deleteById(u.getId());
    }
    */
    
    
}
