package com.microservicio.usuario.book.controllers;

import com.microservicio.usuario.book.model.Usuario;
import com.microservicio.usuario.book.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    @PostMapping("/crear")
    public ResponseEntity<Usuario>guardarUsuario(@RequestBody Usuario usuarioRequest){
        Usuario usuario = usuarioService.guardarUsuario(usuarioRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @GetMapping("/usuario")
    public ResponseEntity<Usuario>obtenerUsuario(@PathVariable Long idUsuario){
        Usuario usuario = usuarioService.obtenerPorId(idUsuario);
        return ResponseEntity.ok(usuario)
    }


    public ResponseEntity<List<Usuario>>listarUsuarios(){
        List<Usuario> usuarios = usuarioService.obtenerTodosLosUsuarios();
        return ResponseEntity.ok(usuarios);
    }
}
