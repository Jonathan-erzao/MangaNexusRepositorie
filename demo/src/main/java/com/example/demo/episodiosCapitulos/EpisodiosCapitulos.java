package com.example.demo.episodiosCapitulos;

import java.sql.Date;

import com.example.demo.mangaManhwa.MangaManhwa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class EpisodiosCapitulos {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private Integer nro_cap;
    
    @Lob
    private String contenido;
    private Date fecha_publicacion;

    @ManyToOne
    private MangaManhwa mangaManhwa;
}
