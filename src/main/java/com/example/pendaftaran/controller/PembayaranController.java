package com.example.pendaftaran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pendaftaran.model.Pembayaran;
import com.example.pendaftaran.service.PembayaranService;

import java.util.List;

@RestController
@RequestMapping("/api/pembayaran")
public class PembayaranController {
    @Autowired
    private PembayaranService pembayaranService;

    @GetMapping
    public List<Pembayaran> getAllPembayaran() {
        return pembayaranService.getAllPembayaran();
    }

    @GetMapping("/{id}")
    public Pembayaran getPembayaranById(@PathVariable int id) {
        return pembayaranService.getPembayaranById(id);
    }

    @PostMapping
    public Pembayaran createPembayaran(@RequestBody Pembayaran pembayaran) {
        return pembayaranService.createPembayaran(pembayaran);
    }

    @PutMapping("/{id}")
    public Pembayaran updatePembayaran(@PathVariable int id, @RequestBody Pembayaran pembayaranDetails) {
        return pembayaranService.updatePembayaran(id, pembayaranDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePembayaran(@PathVariable int id) {
        pembayaranService.deletePembayaran(id);
    }
}
