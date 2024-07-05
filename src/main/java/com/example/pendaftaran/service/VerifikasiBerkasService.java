package com.example.pendaftaran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pendaftaran.model.VerifikasiBerkas;
import com.example.pendaftaran.repository.VerifikasiBerkasRepository;

import java.util.List;

@Service
public class VerifikasiBerkasService {
    @Autowired
    private VerifikasiBerkasRepository verifikasiBerkasRepository;

    public List<VerifikasiBerkas> getAllVerifikasiBerkas() {
        return verifikasiBerkasRepository.findAll();
    }

    public VerifikasiBerkas getVerifikasiBerkasById(int id) {
        return verifikasiBerkasRepository.findById(id).orElse(null);
    }

    public VerifikasiBerkas createVerifikasiBerkas(VerifikasiBerkas verifikasiBerkas) {
        return verifikasiBerkasRepository.save(verifikasiBerkas);
    }

    public VerifikasiBerkas updateVerifikasiBerkas(int id, VerifikasiBerkas verifikasiBerkasDetails) {
        VerifikasiBerkas verifikasiBerkas = verifikasiBerkasRepository.findById(id).orElse(null);
        if (verifikasiBerkas != null) {
            ((Object) verifikasiBerkas).setStatus_verifikasi(verifikasiBerkasDetails.getStatus_verifikasi());

            return verifikasiBerkasRepository.save(verifikasiBerkas);
        }
        return null;
    }

    public void deleteVerifikasiBerkas(int id) {
        verifikasiBerkasRepository.deleteById(id);
    }
}
