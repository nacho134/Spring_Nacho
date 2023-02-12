package com.example.UT5_Spring;


import com.example.UT5_Spring.model.Perro;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface PerroService
{
    List<Perro> findAll();

    Optional<Perro> findById(Long id);
    void crearPerro(Perro p);
    Perro actualizarPerro(Perro p, Long id);
    void borrarPerro(Long id);

}
