package unu.demo.Movimiento.services;

import java.util.List;

import unu.demo.Movimiento.model.modelMovimiento;

public interface serviceIMovimiento {

    public List<modelMovimiento> buscar();
    public modelMovimiento buscarXId (Integer id);
    public modelMovimiento modificar(modelMovimiento alumnoModel);
}
