package com.example.pendaftaran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pendaftaran.model.Tes;

public interface TesRepository extends JpaRepository<Tes, Integer> {
}