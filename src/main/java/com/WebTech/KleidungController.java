package com.WebTech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KleidungController {

    @GetMapping("/suche")
    @RequestMapping("/api")
    public List<Kleidung> kleidungName() {
        Kleidung entry = new Kleidung("Pullover", "S", 2);
        Kleidung entry1 = new Kleidung("T-Shirt", "L", 3);
        Kleidung entry2 = new Kleidung("Hose", "M", 1);
        Kleidung entry3 = new Kleidung("Jacke", "XL", 2);
        Kleidung entry4 = new Kleidung("Pullover", "M", 1);
        return List.of(entry, entry1, entry2, entry3, entry4);
    }
}
