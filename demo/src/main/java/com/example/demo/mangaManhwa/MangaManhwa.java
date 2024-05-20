package com.example.demo.mangaManhwa;

import java.sql.Date;

import com.example.demo.categoria.Categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class MangaManhwa {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private String titulo;
    private String descripcion;
    private String autor;
    private Date fecha_publicacion;
    
    @Enumerated(EnumType.STRING)
    private Type tipo;

    @ManyToOne
    private Categoria categoria;
}

enum Type {
    ANIME, MANHWA
}