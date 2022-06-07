/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.controller;

import com.example.Restaurant.entity.Menu;
import com.example.Restaurant.entity.Pedidos;
import com.example.Restaurant.service.PedidosService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
@RequestMapping("/pedido")
public class PedidosController {
    
    @Autowired
    private PedidosService ps;
    
    
    @GetMapping("/fecha")
    public ResponseEntity<List<Pedidos>> pedidosGetFecha(@RequestParam String fecha,Boolean preparando,Boolean enviado,int cliente){
        return new ResponseEntity<>(ps.pedidosGetFecha(fecha,preparando,enviado,cliente), HttpStatus.OK);
    }
    
    
    @GetMapping
    public List<Pedidos> listar(){
        return ps.listar();
    }
    
    
    @PostMapping
    public Pedidos insert(@RequestBody Pedidos usr){
        return ps.insert(usr);
    }
    
    
    @PutMapping
    public Pedidos update(@RequestBody Pedidos usr){
        return ps.update(usr);
    }
    
    
    @DeleteMapping("/delete")
    public void delete(@RequestParam Integer id){
        ps.delete(id);
    }
    
}