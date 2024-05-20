package com.example.demo.categoria;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //CRUD
    //metodo insert
    public Categoria save(Categoria entity) {
        return categoriaRepository.save(entity);
    }

    //metodo select
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    //Metodo select all
    public List<Categoria> findAll() {
        Iterable<Categoria> iterable = categoriaRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //Metodo delete
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
