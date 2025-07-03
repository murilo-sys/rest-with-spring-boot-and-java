package io.github.murilo_sys.services;

import io.github.murilo_sys.exception.UnsuportedMathOperationExcepiton;
import io.github.murilo_sys.util.NumberConverter;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    private final String mensagem = "Favor inserir números válidos";

    public Double sum(String n1, String n2) {
        return convertAndValidate(n1) + convertAndValidate(n2);
    }

    public Double sub(String n1, String n2) {
        return convertAndValidate(n1) - convertAndValidate(n2);
    }

    public Double multi(String n1, String n2) {
        return convertAndValidate(n1) * convertAndValidate(n2);
    }

    public Double divi(String n1, String n2) {
        return convertAndValidate(n1) / convertAndValidate(n2);
    }

    public Double media(String n1, String n2) {
        return (convertAndValidate(n1) + convertAndValidate(n2)) / 2;
    }

    public Double raiz(String n1) {
        return Math.sqrt(convertAndValidate(n1));
    }

    private Double convertAndValidate(String str) {
        if (!NumberConverter.isNumeric(str)) {
            throw new UnsuportedMathOperationExcepiton(mensagem);
        }
        return NumberConverter.convertToDouble(str);
    }
}
