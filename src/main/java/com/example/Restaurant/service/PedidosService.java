/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.service;

import com.example.Restaurant.entity.Pedidos;
import com.example.Restaurant.repository.PedidosRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PedidosService {
    
    @Autowired
    private PedidosRepository pr;
    
    public Pedidos insert(Pedidos usr){
        return pr.save(usr);
    }
    
    public Pedidos update(Pedidos usr){
        return pr.save(usr);
    }
    
    public List<Pedidos> listar(){
        return pr.findAll();
    }
    
    public List<Pedidos> pedidosGetFecha(String fecha,Boolean preparando,Boolean enviado,int cliente){
        return pr.getPedidos(fecha,preparando,enviado,cliente);
    }
    
    public void delete(Integer id){
        pr.deleteById(id);
    }
}
