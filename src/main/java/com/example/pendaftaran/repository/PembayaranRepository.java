package com.example.pendaftaran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pendaftaran.model.Pembayaran;

public interface PembayaranRepository extends JpaRepository<Pembayaran, Integer> {
}