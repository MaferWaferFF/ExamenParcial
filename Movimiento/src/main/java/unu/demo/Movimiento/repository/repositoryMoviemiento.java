package unu.demo.Movimiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unu.demo.Movimiento.model.modelMovimiento;

public interface repositoryMoviemiento extends JpaRepository<modelMovimiento, Integer> {
    
}


