/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.service;


import com.example.Restaurant.entity.Usuarios;
import com.example.Restaurant.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository clirepo;
    
    public Usuarios insert(Usuarios usr){
        return clirepo.save(usr);
    }
    
    public Usuarios update(Usuarios usr){
        return clirepo.save(usr);
    }
    
    public List<Usuarios> listar(){
        return clirepo.findAll();
    }
    
    public List<Usuarios> userGetServLogin(String email,String password){
        return clirepo.getUserByLogin(email,password);
    }
    
    public List<Usuarios> userGetServId(int id){
        return clirepo.getUserById(id);
    }
    
    public void delete(Usuarios usr){
        clirepo.delete(usr);
    }
}
