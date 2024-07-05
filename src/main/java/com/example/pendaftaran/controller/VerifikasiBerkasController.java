package com.example.pendaftaran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pendaftaran.model.VerifikasiBerkas;
import com.example.pendaftaran.service.VerifikasiBerkasService;

import java.util.List;

@RestController
@RequestMapping("/api/verifikasibarkas")
public class VerifikasiBerkasController {
    @Autowired
    private VerifikasiBerkasService verifikasiBerkasService;

    @GetMapping
    public List<VerifikasiBerkas> getAllVerifikasiBerkas() {
        return verifikasiBerkasService.getAllVerifikasiBerkas();
    }

    @GetMapping("/{id}")
    public VerifikasiBerkas getVerifikasiBerkasById(@PathVariable int id) {
        return verifikasiBerkasService.getVerifikasiBerkasById(id);
    }

    @PostMapping
    public VerifikasiBerkas createVerifikasiBerkas(@RequestBody VerifikasiBerkas verifikasiBerkas) {
        return verifikasiBerkasService.createVerifikasiBerkas(verifikasiBerkas);
    }

    @PutMapping("/{id}")
    public VerifikasiBerkas updateVerifikasiBerkas(@PathVariable int id,
            @RequestBody VerifikasiBerkas verifikasiBerkasDetails) {
        return verifikasiBerkasService.updateVerifikasiBerkas(id, verifikasiBerkasDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteVerifikasiBerkas(@PathVariable int id) {
        verifikasiBerkasService.deleteVerifikasiBerkas(id);
    }
}
