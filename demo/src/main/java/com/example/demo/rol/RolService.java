package com.example.demo.rol;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    //CRUD
    //metodo insert
    public Rol save(Rol entity) {
        return rolRepository.save(entity);
    }

    //metodo select
    public Rol findById(Long id) {
        return rolRepository.findById(id).orElse(null);
    }

    //Metodo select all
    public List<Rol> findAll() {
        Iterable<Rol> iterable = rolRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    //Metodo delete
    public void deleteById(Long id) {
        rolRepository.deleteById(id);
    }
}
