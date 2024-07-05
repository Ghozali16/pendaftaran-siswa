package com.example.pendaftaran.model;

import javax.persistence.*;

import com.example.pendaftaran.service.CalonSiswa;

@Entity
public class VerifikasiBerkas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "fkIdAdmin")
    private Admin admin;

    @OneToOne
    @JoinColumn(name = "fkIdBerkas")
    private Berkas berkas;

    @ManyToOne
    @JoinColumn(name = "fkIdCalonSiswa")
    private CalonSiswa calonSiswa;

    public Object getStatus_verifikasi() {

        throw new UnsupportedOperationException("Unimplemented method 'getStatus_verifikasi'");
    }

    // Getter dan Setter
}
