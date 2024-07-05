package com.example.pendaftaran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pendaftaran.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
