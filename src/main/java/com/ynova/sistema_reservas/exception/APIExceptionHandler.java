package com.ynova.sistema_reservas.exception;

import java.net.http.HttpHeaders;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ynova.sistema_reservas.dto.ErrorDTO;

@RestControllerAdvice
public class APIExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(MessageExceptions.class)
    public ResponseEntity<ErrorDTO> duplicateResource(MessageExceptions e, WebRequest request){
        return ResponseEntity.status(e.getStatus())
            .body(new ErrorDTO(e.getDescription(), e.getReasons()));
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus httpStatus,
                                                                                                                            WebRequest request){
        List<String> reason = new ArrayList<>();
    }

}
