package com.flota.flotavehiculos;

import javax.persistence.*;

@Entity
@Table(name = "tipovehi")
public class Tipovehiculo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtv;
    @Column
    private String nomtv;

    public int getIdtv() {
        return idtv;
    }

    public void setIdtv(int idtv) {
        this.idtv = idtv;
    }

    public String getNomtv() {
        return nomtv;
    }

    public void setNomtv(String nomtv) {
        this.nomtv = nomtv;
    }    
    
}
