package io.github.murilo_sys.services;

import io.github.murilo_sys.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
        private static final String template = "oi, %s!";
        private final AtomicLong counter = new AtomicLong();

        public Greeting createGreeting(String name){
            long id = counter.incrementAndGet();
            String message = String.format(template, name);
            return new Greeting(id, message);
        }
}
