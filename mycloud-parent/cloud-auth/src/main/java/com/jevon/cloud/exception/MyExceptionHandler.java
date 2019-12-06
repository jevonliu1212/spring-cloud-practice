package com.jevon.cloud.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Throwable.class)
    public String handler(Throwable throwable, Model model){
        model.addAttribute("errorMessage", throwable.getMessage());
        return "error";
    }
}
