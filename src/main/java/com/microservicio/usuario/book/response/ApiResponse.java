package com.microservicio.usuario.book.response;

import lombok.*;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {

    private String mensaje;

    private boolean sucess;

    private HttpStatus status;
}
