package com.vitu.relationship02.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "postagens")
@Getter
@Setter
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String titulo;
    private String texto;

    //Varios comentarios dentro de um post
    @OneToMany
    @JoinColumn(name = "codigo_postagem")
    private List<Comentario> comentarios;
}
