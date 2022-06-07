
package com.example.Restaurant.controller;

import com.example.Restaurant.entity.Menu;
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
@RequestMapping("/menu")
public class MenuController {
    
    @Autowired
    private MenuService menser;
    
    @GetMapping("/categoria")
    public ResponseEntity<List<Menu>> getMenuByCategoria(@RequestParam String categoria){
        return new ResponseEntity<>(menser.menuGetServCategoria(categoria), HttpStatus.OK);
    }
    
    
    @GetMapping
    public List<Menu> listar(){
        return menser.listar();
    }
    
    
    @PostMapping
    public Menu insert(@RequestBody Menu usr){
        return menser.insert(usr);
    }
    
    
    @PutMapping
    public Menu update(@RequestBody Menu usr){
        return menser.update(usr);
    }
    
    
    @DeleteMapping("/delete")
    public void delete(@RequestParam Integer id){
        menser.delete(id);
    }
}
