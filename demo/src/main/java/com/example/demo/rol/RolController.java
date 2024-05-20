package com.example.demo.rol;

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
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private RolService rolService;

    //Metodo create
    @PostMapping("/")
    public Rol save(@RequestBody Rol entity)
    {
        return rolService.save(entity);
    }

    //Metodo select
    @GetMapping("/{id}/")
    public Rol findById(@PathVariable Long id)
    {
        return rolService.findById(id);
    }

    //Metodo select all
    @GetMapping("/all")
    public List<Rol> findAll() {
        return rolService.findAll();
    }

    //Metodo update
    @PutMapping("/u")
    public Rol update(@RequestBody Rol Entity)
    {
        return rolService.save(Entity);
    }

    // Método delete
    @DeleteMapping("/{id}/")
    public void delete(@PathVariable Long id) {
        rolService.deleteById(id);
    }
}
