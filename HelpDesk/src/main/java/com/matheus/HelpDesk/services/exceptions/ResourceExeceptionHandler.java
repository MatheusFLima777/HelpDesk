package com.matheus.HelpDesk.services.exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExeceptionHandler {

    @ExceptionHandler(ObjNotFoundException.class)
    public ResponseEntity<StandardError> objNotFoundExcepiton(ObjNotFoundException ex,
                                                              HttpServletRequest request){

    StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), "Registro não encontrado!", 
                                           ex.getMessage(), request.getRequestURI());
       
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
}

       

}
