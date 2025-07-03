package io.github.murilo_sys.exception.handler;

import io.github.murilo_sys.exception.ExceptionReponse;
import io.github.murilo_sys.exception.UnsuportedMathOperationExcepiton;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustumEntityResponseHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionReponse> handleAllExceptions(Exception ex, WebRequest request) {
        ExceptionReponse response = new ExceptionReponse(
                new Date(),
                "ERROR 500",
                ex.getMessage(),
                request.getDescription(false));
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UnsuportedMathOperationExcepiton.class)
    public final ResponseEntity<ExceptionReponse> handleBadRequestExceptions(Exception ex, WebRequest request) {
        ExceptionReponse response = new ExceptionReponse(
                new Date(),
                "ERROR 400",
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


}
