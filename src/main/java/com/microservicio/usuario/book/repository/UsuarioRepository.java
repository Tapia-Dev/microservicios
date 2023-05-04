package com.microservicio.usuario.book.repository;

import com.microservicio.usuario.book.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
