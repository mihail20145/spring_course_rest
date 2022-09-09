package com.zaurtregulov.spring.rest.exeption_hendong;

public class NoSuchEmployeeExeption extends RuntimeException{
    public NoSuchEmployeeExeption(String message) {
        super(message);
    }
}
