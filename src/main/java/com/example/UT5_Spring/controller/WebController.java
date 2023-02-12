package com.example.UT5_Spring.controller;


import com.example.UT5_Spring.model.Perro;
import com.example.UT5_Spring.PerroServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController
{
    @Autowired
    PerroServiceImplementation psi;

    @PostMapping("/alta")
    public void insertarPerro(Perro p)
    {
        psi.crearPerro(p);
    }
    @GetMapping("/listar")
    public List<Perro>perros()
    {
      return psi.findAll();
    }
    @PutMapping("/actualizar/{id}")
    public Perro actualizarPerros(Perro p,@PathVariable Long id)
    {
        return psi.actualizarPerro(p,id);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarPerro(@PathVariable Long id)
    {
        psi.borrarPerro(id);
    }



}
