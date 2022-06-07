/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.repository;

import com.example.Restaurant.entity.Usuarios;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer>{
    
    @Query("SELECT u FROM Usuarios u WHERE u.email =?1 AND u.password =?2")
    public List<Usuarios> getUserByLogin(String email,String password);
    
    @Query("SELECT u FROM Usuarios u WHERE u.id =?1")
    public List<Usuarios> getUserById(int id);
    
}
