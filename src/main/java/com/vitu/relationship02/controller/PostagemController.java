package com.vitu.relationship02.controller;

import com.vitu.relationship02.model.Postagem;
import com.vitu.relationship02.repositories.PostagemRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

    @Autowired //Nao fica instanciando o objeto
    private PostagemRepositorie postagemRepositorie;


    @GetMapping("/listar")
    public List<Postagem> listar(){
        return postagemRepositorie.findAll();
    }


    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem postagem){
        return postagemRepositorie.save(postagem);
    }
}
