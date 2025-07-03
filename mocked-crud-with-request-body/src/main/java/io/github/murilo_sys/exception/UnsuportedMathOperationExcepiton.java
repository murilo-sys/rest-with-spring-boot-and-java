package io.github.murilo_sys.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationExcepiton extends RuntimeException {
    public UnsuportedMathOperationExcepiton(String message) {
        super(message);
    }
}
