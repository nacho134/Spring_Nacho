package com.example.UT5_Spring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "perros")
public class Perro
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String raza;
    @Column
    private int edad;


    public void setDriverClassName(String driverClassName) {
    }

    public void setUsername(String username) {
    }

    public void setUrl(String url) {
    }
}
