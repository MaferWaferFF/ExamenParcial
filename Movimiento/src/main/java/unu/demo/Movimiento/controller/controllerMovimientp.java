package unu.demo.Movimiento.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import unu.demo.Movimiento.exception.ResourceNotFoundException;
import unu.demo.Movimiento.model.modelMovimiento;
import unu.demo.Movimiento.repository.repositoryMoviemiento;
import unu.demo.Movimiento.services.serviceIMovimiento;
import unu.demo.Movimiento.services.serviceMovimiento;

@RestController
@RequestMapping("/api/movimientos ")
public class controllerMovimientp {
    
     private static final Logger logger = LoggerFactory.getLogger(controllerMovimientp.class);

    @Autowired
    private repositoryMoviemiento moviRepository;
   //private serviceArticulo ariService;

    @PostMapping
    public modelMovimiento crearMovmiento(@RequestBody modelMovimiento movi) {
        return moviRepository.save(movi);
    }

    @GetMapping
    public List<modelMovimiento> obtenerAlumnos() {
        return moviRepository.findAll();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<modelMovimiento> actualizar(@PathVariable Integer id, @RequestBody modelMovimiento movimientoActualizado) {
        modelMovimiento movimiento = moviRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Alumno no encontrado con id: " + id));

        movimiento.setTipoMovimiento(movimientoActualizado.getTipoMovimiento());
        movimiento.setCantidad(movimientoActualizado.getCantidad());
        

        modelMovimiento guardado = serviceMovimiento.modificar(movimiento);
        return ResponseEntity.ok(guardado);
    }

}
