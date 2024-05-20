package com.example.demo.categoria;

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
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    //Metodo create
    @PostMapping("/")
    public Categoria save(@RequestBody Categoria entity)
    {
        return categoriaService.save(entity);
    }

    //Metodo select
    @GetMapping("/{id}/")
    public Categoria findById(@PathVariable Long id)
    {
        return categoriaService.findById(id);
    }

    //Metodo select all
    @GetMapping("/all")
    public List<Categoria> findAll() {
        return categoriaService.findAll();
    }

    //Metodo update
    @PutMapping("/u")
    public Categoria update(@RequestBody Categoria Entity)
    {
        return categoriaService.save(Entity);
    }

    // Método delete
    @DeleteMapping("/{id}/")
    public void delete(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }
}
