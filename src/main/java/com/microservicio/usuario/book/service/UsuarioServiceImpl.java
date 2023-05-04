package com.microservicio.usuario.book.service;


import com.microservicio.usuario.book.exceptions.ResourceNotFound;
import com.microservicio.usuario.book.model.Usuario;
import com.microservicio.usuario.book.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario obtenerPorId(Long idUsuario) {
        return usuarioRepository.findById(idUsuario)
                .orElseThrow(() ->new ResourceNotFound("Usuario no encontrado con el id" + idUsuario));
    }
}
