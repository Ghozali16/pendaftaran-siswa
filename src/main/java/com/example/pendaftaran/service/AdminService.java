package com.example.pendaftaran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pendaftaran.model.Admin;
import com.example.pendaftaran.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(int id) {
        return adminRepository.findById(id).orElse(null);
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin updateAdmin(int id, Admin adminDetails) {
        Admin admin = adminRepository.findById(id).orElse(null);
        if (admin != null) {
            admin.setUsername(adminDetails.getUsername());
            // Set other fields
            return adminRepository.save(admin);
        }
        return null;
    }

    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}