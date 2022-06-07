/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.repository;


import com.example.Restaurant.entity.Lista;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaRepository extends JpaRepository<Lista, Integer>{
    
    @Query("SELECT l FROM Lista l WHERE l.fecha = :fecha AND l.estado =:estado")
    public List<Lista> getListByFechaAndEstado(String fecha,String estado);
    
    @Query("SELECT l FROM Lista l WHERE id_usuario = :id")
    public List<Lista> getListById(int id);
}
