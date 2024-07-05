package com.example.pendaftaran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pendaftaran.model.Pembayaran;
import com.example.pendaftaran.repository.PembayaranRepository;

import java.util.List;

@Service
public class PembayaranService {
    @Autowired
    private PembayaranRepository pembayaranRepository;

    public List<Pembayaran> getAllPembayaran() {
        return pembayaranRepository.findAll();
    }

    public Pembayaran getPembayaranById(int id) {
        return pembayaranRepository.findById(id).orElse(null);
    }

    public Pembayaran createPembayaran(Pembayaran pembayaran) {
        return pembayaranRepository.save(pembayaran);
    }

    public Pembayaran updatePembayaran(int id, Pembayaran pembayaranDetails) {
        Pembayaran pembayaran = pembayaranRepository.findById(id).orElse(null);
        if (pembayaran != null) {
            pembayaran.setJumlah_bayar(((Object) pembayaranDetails).getJumlah_bayar());
            // Set other fields
            return pembayaranRepository.save(pembayaran);
        }
        return null;
    }

    public void deletePembayaran(int id) {
        pembayaranRepository.deleteById(id);
    }
}
