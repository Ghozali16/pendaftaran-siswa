package com.example.pendaftaran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pendaftaran.model.Berkas;

public interface BerkasRepository extends JpaRepository<Berkas, Integer> {
}
