package com.example.pendaftaran.model;

import javax.persistence.*;

import com.example.pendaftaran.service.CalonSiswa;

@Entity
public class Berkas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "fkIdCalonSiswa")
    private CalonSiswa calonSiswa;

    @OneToOne(mappedBy = "berkas")
    private VerifikasiBerkas verifikasiBerkas;

    public Object getNama_berkas() {

        throw new UnsupportedOperationException("Unimplemented method 'getNama_berkas'");
    }

    // Getter dan Setter
}
