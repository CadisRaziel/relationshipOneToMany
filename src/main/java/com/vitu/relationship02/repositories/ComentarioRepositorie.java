package com.vitu.relationship02.repositories;

import com.vitu.relationship02.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ComentarioRepositorie extends JpaRepository<Comentario, Long> {
}
