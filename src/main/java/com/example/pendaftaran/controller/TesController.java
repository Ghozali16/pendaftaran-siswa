package com.example.pendaftaran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pendaftaran.model.Tes;
import com.example.pendaftaran.service.TesService;

import java.util.List;

@RestController
@RequestMapping("/api/tes")
public class TesController {
    @Autowired
    private TesService tesService;

    @GetMapping
    public List<Tes> getAllTes() {
        return tesService.getAllTes();
    }

    @GetMapping("/{id}")
    public Tes getTesById(@PathVariable int id) {
        return tesService.getTesById(id);
    }

    @PostMapping
    public Tes createTes(@RequestBody Tes tes) {
        return tesService.createTes(tes);
    }

    @PutMapping("/{id}")
    public Tes updateTes(@PathVariable int id, @RequestBody Tes tesDetails) {
        return tesService.updateTes(id, tesDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTes(@PathVariable int id) {
        tesService.deleteTes(id);
    }
}
