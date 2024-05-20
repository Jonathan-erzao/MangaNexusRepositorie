package com.example.demo.usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    //CRUD
    //metodo insert
    public Usuario save(Usuario entity) {
        return usuarioRepository.save(entity);
    }

    //metodo select
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    //Metodo select all
    public List<Usuario> findAll() {
        Iterable<Usuario> iterable = usuarioRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //Metodo delete
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
