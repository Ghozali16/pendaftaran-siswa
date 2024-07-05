package com.example.pendaftaran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pendaftaran.repository.CalonSiswaRepository;

import java.util.List;

@Service
public class CalonSiswaService {
    @Autowired
    private CalonSiswaRepository calonSiswaRepository;

    public List<CalonSiswa> getAllCalonSiswa() {
        return calonSiswaRepository.findAll();
    }

    public CalonSiswa getCalonSiswaById(int id) {
        return calonSiswaRepository.findById(id).orElse(null);
    }

    public CalonSiswa createCalonSiswa(com.example.pendaftaran.controller.CalonSiswa calonSiswa) {
        return CalonSiswa.save(calonSiswa);
    }

    public CalonSiswa updateCalonSiswa(int id, com.example.pendaftaran.controller.CalonSiswa calonSiswaDetails) {
        CalonSiswa calonSiswa = calonSiswaRepository.findById(id).orElse(null);
        if (calonSiswa != null) {
            calonSiswa.setNo_pendaftaran(((Object) calonSiswaDetails).getNo_pendaftaran());
            // Set other fields
            return CalonSiswa.save(calonSiswa);
        }
        return null;
    }

    public com.example.pendaftaran.controller.CalonSiswaexample.pendaftaran.controller.CalonSiswa deleteCalonSiswa(
            int id) {
        calonSiswaRepository.deleteById(id);
    }
}
