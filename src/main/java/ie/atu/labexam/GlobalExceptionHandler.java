package ie.atu.labexam;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.ArrayList;

@RestController
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<ErrorDetails> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<ErrorDetails> errors = newArrayList<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            String fieldName = error.getField();
            String errorMessage = error.getDefaultMessage();
            ErrorDetails errorDetails = new ErrorDetails(fieldName, errorMessage);
            errors.add(errorDetails);
        });

        return errors;
    }
}
