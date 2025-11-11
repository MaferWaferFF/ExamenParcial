package unu.demo.Articulo.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Articulo")
public class modelArticulo {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArticulo")
    private Integer idArticulo;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "precio")
    private Double precio;

    public Integer getId_articulo() {
        return idArticulo;
    }
    public void setId_articulo(Integer id_articulo) {
        this.idArticulo = id_articulo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    } 

}