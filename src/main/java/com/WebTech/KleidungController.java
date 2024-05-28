package com.WebTech;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KleidungController {

    @GetMapping("/api/suche")
    @CrossOrigin(origins = "http://localhost:5173")
    public List<Kleidung> kleidungName() {
        Kleidung entry = new Kleidung("Pullover", "S", 2, 4);
        Kleidung entry1 = new Kleidung("T-Shirt", "L", 3, 2);
        Kleidung entry2 = new Kleidung("Hose", "M", 1, 3);
        Kleidung entry3 = new Kleidung("Jacke", "XL", 2, 1);
        Kleidung entry4 = new Kleidung("Pullover", "M", 1, 2);
        return List.of(entry, entry1, entry2, entry3, entry4);
    }
}
