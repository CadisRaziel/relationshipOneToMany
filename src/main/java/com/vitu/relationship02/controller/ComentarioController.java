package com.vitu.relationship02.controller;

import com.vitu.relationship02.model.Comentario;
import com.vitu.relationship02.repositories.ComentarioRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private ComentarioRepositorie comentarioRepositorie;


    @GetMapping("/listar")
    public List<Comentario> listar(){
        return comentarioRepositorie.findAll();
    }


    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario comentario){
        return comentarioRepositorie.save(comentario);
    }

}
