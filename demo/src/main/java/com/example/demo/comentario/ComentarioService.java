package com.example.demo.comentario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {
    
    @Autowired
    private ComentarioRepository comentarioRepository;

    //CRUD
    //metodo insert
    public Comentario save(Comentario entity) {
        return comentarioRepository.save(entity);
    }

    //metodo select
    public Comentario findById(Long id) {
        return comentarioRepository.findById(id).orElse(null);
    }

    //Metodo delete
    public void deleteById(Long id) {
        comentarioRepository.deleteById(id);
    }
}
