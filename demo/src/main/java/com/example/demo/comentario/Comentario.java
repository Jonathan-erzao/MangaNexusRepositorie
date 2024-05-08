package com.example.demo.comentario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Comentario {

    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private String usuario;
    private String coment;
}
