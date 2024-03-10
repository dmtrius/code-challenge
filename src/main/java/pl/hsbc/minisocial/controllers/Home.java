package pl.hsbc.minisocial.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class Home {

    @GetMapping("/")
    public Map<String, LocalDateTime> home() {
        Map<String, LocalDateTime> now = new LinkedHashMap<>();
        now.put("now", LocalDateTime.now());
        return now;
    }
}
