package com.fpelizza.todoapp.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class ToDoExceptions extends RuntimeException {
    private String msg;
    private HttpStatus httpStatus;

    public ToDoExceptions(String msg, HttpStatus httpStatus) {
        super(msg);
        this.msg = msg;
        this.httpStatus = httpStatus;
    }
}
