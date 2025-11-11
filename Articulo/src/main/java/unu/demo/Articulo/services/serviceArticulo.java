package unu.demo.Articulo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.transaction.Transactional;
import unu.demo.Articulo.model.modelArticulo;
import unu.demo.Articulo.repository.repositoryArticulo;

public class serviceArticulo implements serviceIArticulo {
     @Autowired
        repositoryArticulo articuloRepository;

     @Override
     public List<modelArticulo> buscar() {
        return (List<modelArticulo>) articuloRepository.findAll();
     }

     @Override
     public modelArticulo buscarXId(Integer id) {
        return articuloRepository.findById(id).orElse(null);
     }

     @Override
     @Transactional
     public modelArticulo modificar(modelArticulo articulo) {
        return articuloRepository.save(articulo);
     }
    
    
}