package com.example.pendaftaran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pendaftaran.model.Pengumuman;
import com.example.pendaftaran.repository.PengumumanRepository;

import java.util.List;

@Service
public class PengumumanService {
    @Autowired
    private PengumumanRepository pengumumanRepository;

    public List<Pengumuman> getAllPengumuman() {
        return pengumumanRepository.findAll();
    }

    public Pengumuman getPengumumanById(int id) {
        return pengumumanRepository.findById(id).orElse(null);
    }

    public Pengumuman createPengumuman(Pengumuman pengumuman) {
        return pengumumanRepository.save(pengumuman);
    }

    public Pengumuman updatePengumuman(int id, Pengumuman pengumumanDetails) {
        Pengumuman pengumuman = pengumumanRepository.findById(id).orElse(null);
        if (pengumuman != null) {
            pengumuman.setIsi_pengumuman(pengumumanDetails.getIsi_pengumuman());
            // Set other fields
            return pengumumanRepository.save(pengumuman);
        }
        return null;
    }

    public void deletePengumuman(int id) {
        pengumumanRepository.deleteById(id);
    }
}
