package com.example.UT5_Spring;

import com.example.UT5_Spring.model.Perro;
import org.springframework.data.repository.CrudRepository;

public interface PerroRepository extends CrudRepository<Perro,Long>
{

}
