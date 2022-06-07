/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Restaurant.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CRISTIAN
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findById", query = "SELECT p FROM Pedidos p WHERE p.id = :id"),
    @NamedQuery(name = "Pedidos.findByTotalPagar", query = "SELECT p FROM Pedidos p WHERE p.totalPagar = :totalPagar"),
    @NamedQuery(name = "Pedidos.findByFecha", query = "SELECT p FROM Pedidos p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Pedidos.findByEnviado", query = "SELECT p FROM Pedidos p WHERE p.enviado = :enviado"),
    @NamedQuery(name = "Pedidos.findByCantidadProductos", query = "SELECT p FROM Pedidos p WHERE p.cantidadProductos = :cantidadProductos"),
    @NamedQuery(name = "Pedidos.findByPreparando", query = "SELECT p FROM Pedidos p WHERE p.preparando = :preparando")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "total_pagar")
    private String totalPagar;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "enviado")
    private boolean enviado;
    @Basic(optional = false)
    @Column(name = "cantidad_productos")
    private String cantidadProductos;
    @Basic(optional = false)
    @Column(name = "preparando")
    private boolean preparando;
    @JoinColumn(name = "id_menu", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Menu idMenu;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios idCliente;

    public Pedidos() {
    }

    public Pedidos(Integer id) {
        this.id = id;
    }

    public Pedidos(Integer id, String totalPagar, String fecha, boolean enviado, String cantidadProductos, boolean preparando) {
        this.id = id;
        this.totalPagar = totalPagar;
        this.fecha = fecha;
        this.enviado = enviado;
        this.cantidadProductos = cantidadProductos;
        this.preparando = preparando;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(String totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public String getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(String cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public boolean getPreparando() {
        return preparando;
    }

    public void setPreparando(boolean preparando) {
        this.preparando = preparando;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    public Usuarios getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Usuarios idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.Restaurant.entity.Pedidos[ id=" + id + " ]";
    }
    
}
