package unu.demo.Articulo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unu.demo.Articulo.model.modelArticulo;

@Repository
public interface repositoryArticulo extends JpaRepository<modelArticulo, Integer> {
    
}

