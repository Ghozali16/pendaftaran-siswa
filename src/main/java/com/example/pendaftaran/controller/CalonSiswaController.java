package com.example.pendaftaran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pendaftaran.service.CalonSiswaService;

import java.util.List;

@RestController
@RequestMapping("/calonSiswa")
public class CalonSiswaController {
    @Autowired
    private CalonSiswaService calonSiswaService;

    @GetMapping
    public List<com.example.pendaftaran.service.CalonSiswa> getAllCalonSiswa() {
        return calonSiswaService.getAllCalonSiswa();
    }

    @PostMapping
    public CalonSiswa createCalonSiswa(@RequestBody int calonSiswa) {
        return calonSiswaService.deleteCalonSiswa(calonSiswa);
    }

    @GetMapping("/{id}")
    public com.example.pendaftaran.service.CalonSiswa getCalonSiswaById(@PathVariable int id) {
        return calonSiswaService.getCalonSiswaById(id);
    }

    @PutMapping("/{id}")
    public com.example.pendaftaran.service.CalonSiswa updateCalonSiswa(@PathVariable int id,
            @RequestBody CalonSiswa calonSiswaDetails) {
        return calonSiswaService.updateCalonSiswa(id, calonSiswaDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCalonSiswa(@PathVariable int id) {
        calonSiswaService.deleteCalonSiswa(id);
    }
}
