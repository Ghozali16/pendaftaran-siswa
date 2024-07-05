package com.example.pendaftaran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pendaftaran.model.Pengumuman;
import com.example.pendaftaran.service.PengumumanService;

import java.util.List;

@RestController
@RequestMapping("/api/pengumuman")
public class PengumumanController {
    @Autowired
    private PengumumanService pengumumanService;

    @GetMapping
    public List<Pengumuman> getAllPengumuman() {
        return pengumumanService.getAllPengumuman();
    }

    @GetMapping("/{id}")
    public Pengumuman getPengumumanById(@PathVariable int id) {
        return pengumumanService.getPengumumanById(id);
    }

    @PostMapping
    public Pengumuman createPengumuman(@RequestBody Pengumuman pengumuman) {
        return pengumumanService.createPengumuman(pengumuman);
    }

    @PutMapping("/{id}")
    public Pengumuman updatePengumuman(@PathVariable int id, @RequestBody Pengumuman pengumumanDetails) {
        return pengumumanService.updatePengumuman(id, pengumumanDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePengumuman(@PathVariable int id) {
        pengumumanService.deletePengumuman(id);
    }
}
