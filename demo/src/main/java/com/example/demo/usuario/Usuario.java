package com.example.demo.usuario;

import java.sql.Date;

import com.example.demo.rol.Rol;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private String nombre;
    private String correo;
    private String password;
    private Date fecha_registro;

    @ManyToOne
    private Rol rol;
}
