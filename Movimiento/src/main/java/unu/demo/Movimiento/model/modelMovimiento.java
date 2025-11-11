package unu.demo.Movimiento.model;
//import com.unu.demo.Articulo.modelArticulo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Movimiento")
public class modelMovimiento {
   private static final long serialVersionUID = 1L;

  

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMovimiento")
    private Integer idMovimiento;

    @ManyToOne
    @JoinColumn(name = "id_articulo", nullable = false)
    //private modelArticulo idArticulo;s

    @Column(name = "tipoMovimiento")
    private String tipoMovimiento;

    @Column(name = "cantidad")
    private double cantidad;

    @Column(name = "estado")
    private boolean estado;

    public Integer getidMovimiento() {
        return idMovimiento;
    }
    public void setidMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }
    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}