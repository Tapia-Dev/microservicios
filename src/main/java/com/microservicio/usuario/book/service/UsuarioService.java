package com.microservicio.usuario.book.service;

import com.microservicio.usuario.book.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UsuarioService {

    Usuario guardarUsuario(Usuario usuario);

    List<Usuario> obtenerTodosLosUsuarios();

    Usuario obtenerPorId(Long idUsuario);


}
