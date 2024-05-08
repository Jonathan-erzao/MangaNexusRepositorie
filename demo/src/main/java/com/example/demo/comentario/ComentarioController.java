package com.example.demo.comentario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/test")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService; 

    //Metodo create
    @PostMapping("/")
    public Comentario save(@RequestBody Comentario entity)
    {
        return comentarioService.save(entity);
    }
   
    //Metodo select
    @GetMapping("/{id}/")
    public Comentario findById(@PathVariable Long id)
    {
        return comentarioService.findById(id);
    }

    //Metodo update
    @PutMapping("/")
    public Comentario update(@RequestBody Comentario Entity)
    {
        return comentarioService.save(Entity);
    }

    // Método delete
    @DeleteMapping("/{id}/")
    public void delete(@PathVariable Long id) {
        comentarioService.deleteById(id);
    }
}


