/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.service;


import com.example.Restaurant.entity.Lista;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Restaurant.repository.ListaRepository;

@Service
public class ListaService {
    
    @Autowired
    private ListaRepository lur;
    
    
    public Lista insert(Lista usr){
        return lur.save(usr);
    }
    
    public Lista update(Lista usr){
        return lur.save(usr);
    }
    
    public List<Lista> listar(){
        return lur.findAll();
    }
    
    public List<Lista> listaGetServFechaAndEstado(String fecha,String estado){
        return lur.getListByFechaAndEstado(fecha,estado);
    }
    
    public List<Lista> listaGetServId(int id){
        return lur.getListById(id);
    }
    
    public void delete(Integer id){
        lur.deleteById(id);
    }
}
