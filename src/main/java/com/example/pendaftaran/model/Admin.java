package com.example.pendaftaran.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "admin")
    private Set<VerifikasiBerkas> verifikasiBerkas;

    public Object getUsername() {

        throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
    }

    public void setUsername(Object username) {
        throw new UnsupportedOperationException("Unimplemented method 'setUsername'");
    }

}
