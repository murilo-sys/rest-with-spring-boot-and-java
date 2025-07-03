package io.github.murilo_sys.controllers;

import io.github.murilo_sys.model.Greeting;
import io.github.murilo_sys.services.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Word") String name) {
        return greetingService.createGreeting(name);
    }
}
