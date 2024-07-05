package com.example.pendaftaran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pendaftaran.model.Berkas;
import com.example.pendaftaran.repository.BerkasRepository;

import java.util.List;

@Service
public class BerkasService {
    @Autowired
    private BerkasRepository berkasRepository;

    public List<Berkas> getAllBerkas() {
        return berkasRepository.findAll();
    }

    public Berkas getBerkasById(int id) {
        return berkasRepository.findById(id).orElse(null);
    }

    public Berkas createBerkas(Berkas berkas) {
        return berkasRepository.save(berkas);
    }

    public Berkas updateBerkas(int id, Berkas berkasDetails) {
        Berkas berkas = berkasRepository.findById(id).orElse(null);
        if (berkas != null) {
            ((Object) berkas).setNama_berkas(berkasDetails.getNama_berkas());
            // Set other fields
            return berkasRepository.save(berkas);
        }
        return null;
    }

    public void deleteBerkas(int id) {
        berkasRepository.deleteById(id);
    }
}
