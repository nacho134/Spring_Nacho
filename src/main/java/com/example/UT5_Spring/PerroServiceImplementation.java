package com.example.UT5_Spring;

import com.example.UT5_Spring.model.Perro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PerroServiceImplementation implements PerroService
{
    @Autowired
    PerroRepository pr;

    @Override
    public List<Perro> findAll() {
        return (List<Perro>)pr.findAll();
    }

    @Override
    public Optional<Perro> findById(Long id) {
        return pr.findById(id);
    }

    @Override
    public void crearPerro(Perro p) {
        pr.save(p);
    }

    @Override
    public Perro actualizarPerro(Perro p, Long id) {
        if(pr.findById(id).isPresent())
        {
            pr.save(p);
        }
        return p;
    }

    @Override
    public void borrarPerro(Long id)
    {
        pr.deleteById(id);
    }
}
