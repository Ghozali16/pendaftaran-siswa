package com.example.pendaftaran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pendaftaran.model.Tes;
import com.example.pendaftaran.repository.TesRepository;

import java.util.List;

@Service
public class TesService {
    @Autowired
    private TesRepository tesRepository;

    public List<Tes> getAllTes() {
        return tesRepository.findAll();
    }

    public Tes getTesById(int id) {
        return tesRepository.findById(id).orElse(null);
    }

    public Tes createTes(Tes tes) {
        return tesRepository.save(tes);
    }

    public Tes updateTes(int id, Tes tesDetails) {
        Tes tes = tesRepository.findById(id).orElse(null);
        if (tes != null) {
            tes.setJenis_tes(((Object) tesDetails).getJenis_tes());
            // Set other fields
            return tesRepository.save(tes);
        }
        return null;
    }

    public void deleteTes(int id) {
        tesRepository.deleteById(id);
    }
}
