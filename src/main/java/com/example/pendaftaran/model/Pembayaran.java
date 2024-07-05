package com.example.pendaftaran.model;

import javax.persistence.*;

import com.example.pendaftaran.service.CalonSiswa;

@Entity
public class Pembayaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "fkIdCalonSiswa")
    private CalonSiswa calonSiswa;

    // Getter dan Setter
}
