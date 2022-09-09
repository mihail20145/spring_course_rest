package com.zaurtregulov.spring.rest.exeption_hendong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExeptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmploeeIncorrectData> handleExeption(NoSuchEmployeeExeption exeption ){

        EmploeeIncorrectData data =new EmploeeIncorrectData();

        data.setInfo(exeption.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);

    }


}
