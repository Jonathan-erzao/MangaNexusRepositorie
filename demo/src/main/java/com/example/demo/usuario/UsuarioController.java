package com.example.demo.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    //Metodo create
    @PostMapping("/")
    public Usuario save(@RequestBody Usuario entity)
    {
        return usuarioService.save(entity);
    }

    //Metodo select
    @GetMapping("/{id}/")
    public Usuario findById(@PathVariable Long id)
    {
        return usuarioService.findById(id);
    }

    //Metodo select all
    @GetMapping("/all")
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    //Metodo update
    @PutMapping("/u")
    public Usuario update(@RequestBody Usuario Entity)
    {
        return usuarioService.save(Entity);
    }

    // Método delete
    @DeleteMapping("/{id}/")
    public void delete(@PathVariable Long id) {
        usuarioService.deleteById(id);
    }
}
