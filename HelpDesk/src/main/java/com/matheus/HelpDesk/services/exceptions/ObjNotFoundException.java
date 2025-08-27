package com.matheus.HelpDesk.services.exceptions;

public class ObjNotFoundException extends RuntimeException {

    public static final long serialVersionUID = 1L;


    public ObjNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public ObjNotFoundException(String message){
        super(message);
    }
}
