package com.vitu.relationship02.repositories;

import com.vitu.relationship02.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepositorie extends JpaRepository<Postagem, Long>{
}
