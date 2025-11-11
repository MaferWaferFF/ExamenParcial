package unu.demo.Articulo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unu.demo.Articulo.model.modelArticulo;
import unu.demo.Articulo.repository.repositoryArticulo;
import unu.demo.Articulo.services.serviceArticulo;

@RestController
@RequestMapping("/api/articulos")

public class controllerArticulo {
     private static final Logger logger = LoggerFactory.getLogger(controllerArticulo.class);

    @Autowired
    private repositoryArticulo artiRepository;
   //private serviceArticulo ariService;

    @PostMapping
    public modelArticulo crearArticulo(@RequestBody modelArticulo articulo) {
        return artiRepository.save(articulo);
    }

    @GetMapping
    public List<modelArticulo> obtenerArticulo() {
        return artiRepository.findAll();
    }

}
