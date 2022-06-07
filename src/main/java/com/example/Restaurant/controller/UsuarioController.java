/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.controller;

import com.example.Restaurant.entity.Usuarios;

import com.example.Restaurant.service.UsuarioService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService cliser;
    
    @GetMapping("/login")
    public ResponseEntity<List<Usuarios>> getUserByLogin(@RequestParam String email,String password){
        return new ResponseEntity<>(cliser.userGetServLogin(email,password), HttpStatus.OK);
    }
    
    @GetMapping("/")
    public ResponseEntity<List<Usuarios>> getUserById(@RequestParam int id){
        return new ResponseEntity<>(cliser.userGetServId(id), HttpStatus.OK);
    }
    
    @GetMapping
    public List<Usuarios> listar(){
        return cliser.listar();
    }
    
    
    @PostMapping
    public Usuarios insert(@RequestBody Usuarios usr){
        return cliser.insert(usr);
    }
    
    
    @PutMapping
    public Usuarios update(@RequestBody Usuarios usr){
        return cliser.update(usr);
    }
    
    
    @DeleteMapping
    public void delete(@RequestBody Usuarios usr){
        cliser.delete(usr);
    }
    
}
