/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.repository;


import com.example.Restaurant.entity.Pedidos;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Integer>{
    
    @Query("SELECT p FROM Pedidos p WHERE p.fecha =:fecha AND p.preparando =:preparando AND p.enviado =:enviado AND id_cliente =:cliente")
    public List<Pedidos> getPedidos(String fecha , Boolean preparando,Boolean enviado,int cliente);
    

    
}
