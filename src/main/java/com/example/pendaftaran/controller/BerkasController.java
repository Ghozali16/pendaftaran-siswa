package com.example.pendaftaran.controller;

import com.example.pendaftaran.model.Berkas;
import com.example.pendaftaran.service.BerkasService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/berkas")
public class BerkasController {
    @Autowired
    private BerkasService berkasService;

    @GetMapping
    public List<Berkas> getAllBerkas() {
        return berkasService.getAllBerkas();
    }

    @GetMapping("/{id}")
    public Berkas getBerkasById(@PathVariable int id) {
        return berkasService.getBerkasById(id);
    }

    @PostMapping
    public Berkas createBerkas(@RequestBody Berkas berkas) {
        return berkasService.createBerkas(berkas);
    }

    @PutMapping("/{id}")
    public Berkas updateBerkas(@PathVariable int id, @RequestBody Berkas berkasDetails) {
        return berkasService.updateBerkas(id, berkasDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteBerkas(@PathVariable int id) {
        berkasService.deleteBerkas(id);
    }
}
