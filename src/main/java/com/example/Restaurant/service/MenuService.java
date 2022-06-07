/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.service;


import com.example.Restaurant.entity.Menu;
import com.example.Restaurant.repository.MenuRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    
    @Autowired
    private MenuRepository menrepo;
    
    
    public Menu insert(Menu usr){
        return menrepo.save(usr);
    }
    
    public Menu update(Menu usr){
        return menrepo.save(usr);
    }
    
    public List<Menu> listar(){
        return menrepo.findAll();
    }
    
    public List<Menu> menuGetServCategoria(String categoria){
        return menrepo.getMenuByCategoria(categoria);
    }
    
    public void delete(Integer id){
        menrepo.deleteById(id);
    }
}
