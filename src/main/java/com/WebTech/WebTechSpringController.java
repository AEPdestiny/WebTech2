package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
    public List<kleidungName> kleidungName() {
        kleidungName entry = new kleidungName("Pullover", "S", 2);
        kleidungName entry1 = new TodoEntry("T-Shirt", "L", 3);
        kleidungName entry2 = new TodoEntry("Hose", "M", 1);
        kleidungName entry3 = new TodoEntry("Jacke", "XL", 2);
        kleidungName entry4 = new TodoEntry("Pullover", "M", 1);
        return List.of(entry, entry1, entry2, entry3, entry4);
    }
}