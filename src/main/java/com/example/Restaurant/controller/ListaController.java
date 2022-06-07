
package com.example.Restaurant.controller;

import com.example.Restaurant.entity.Lista;
import com.example.Restaurant.entity.Menu;
import com.example.Restaurant.service.ListaService;
import com.example.Restaurant.service.MenuService;

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
@RequestMapping("/lista")
public class ListaController {
    
    @Autowired
    private ListaService lus;
    
    @GetMapping("/fecha")
    public ResponseEntity<List<Lista>> getListByFechaAndEstado(@RequestParam String fecha,String estado){
        return new ResponseEntity<>(lus.listaGetServFechaAndEstado(fecha,estado), HttpStatus.OK);
    }
    
    @GetMapping("/")
    public ResponseEntity<List<Lista>> getListById(@RequestParam int id){
        return new ResponseEntity<>(lus.listaGetServId(id), HttpStatus.OK);
    }
    
    @GetMapping
    public List<Lista> listar(){
        return lus.listar();
    }
    
    
    @PostMapping
    public Lista insert(@RequestBody Lista usr){
        return lus.insert(usr);
    }
    
    
    @PutMapping
    public Lista update(@RequestBody Lista usr){
        return lus.update(usr);
    }
    
    
    @DeleteMapping("/delete")
    public void delete(@RequestParam Integer id){
        lus.delete(id);
    }
}
