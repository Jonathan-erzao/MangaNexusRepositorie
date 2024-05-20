package com.example.demo.rol;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Rol {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private String nombre_rol;
}
