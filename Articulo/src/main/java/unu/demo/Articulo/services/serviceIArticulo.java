package unu.demo.Articulo.services;

import java.util.List;

import unu.demo.Articulo.model.modelArticulo;

public interface serviceIArticulo {
    
    public List<modelArticulo> buscar();
    public modelArticulo buscarXId (Integer id);
    public modelArticulo modificar(modelArticulo alumnoModel);
}
