package com.microservicio.usuario.book.exceptions;

public class ResourceNotFound extends RuntimeException {

    public ResourceNotFound() {
        super("Recurso no encontrado");
    }

    public ResourceNotFound(String message) {
        super(message);
    }
}
