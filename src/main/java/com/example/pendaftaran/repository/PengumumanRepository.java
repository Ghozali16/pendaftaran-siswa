package com.example.pendaftaran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pendaftaran.model.Pengumuman;

public interface PengumumanRepository extends JpaRepository<Pengumuman, Integer> {
}