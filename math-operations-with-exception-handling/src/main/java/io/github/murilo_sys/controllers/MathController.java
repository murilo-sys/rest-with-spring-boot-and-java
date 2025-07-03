package io.github.murilo_sys.controllers;
import io.github.murilo_sys.services.MathService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.sum(numberOne, numberTwo);
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.sub(numberOne, numberTwo);
    }

    @RequestMapping("/multi/{numberOne}/{numberTwo}")
    public Double multi(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.multi(numberOne, numberTwo);
    }

    @RequestMapping("/divi/{numberOne}/{numberTwo}")
    public Double divi(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.divi(numberOne, numberTwo);
    }

    @RequestMapping("/media/{numberOne}/{numberTwo}")
    public Double media(@PathVariable String numberOne, @PathVariable String numberTwo) {
        return mathService.media(numberOne, numberTwo);
    }

    @RequestMapping("/raiz/{number}")
    public Double raiz(@PathVariable String number) {
        return mathService.raiz(number);
    }
}

