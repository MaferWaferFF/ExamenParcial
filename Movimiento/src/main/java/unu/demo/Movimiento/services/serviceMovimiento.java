package unu.demo.Movimiento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.transaction.Transactional;
import unu.demo.Movimiento.model.modelMovimiento;
import unu.demo.Movimiento.repository.repositoryMoviemiento;


public class serviceMovimiento implements serviceIMovimiento {
     @Autowired
        repositoryMoviemiento repositoryMoviemiento;

     @Override
     public List<modelMovimiento> buscar() {
       return (List<modelMovimiento>) repositoryMoviemiento.findAll();
     }

     @Override
     public modelMovimiento buscarXId(Integer id) {
        return repositoryMoviemiento.findById(id).orElse(null);
     }

     @Override
     @Transactional
     public modelMovimiento modificar(modelMovimiento movimiento) {
       return repositoryMoviemiento.save(movimiento);
     }
}
