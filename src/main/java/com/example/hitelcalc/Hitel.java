package com.example.hitelcalc;
/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hitel {

    private int szam;
    private String nev;
    private int honapokszama;
}

 */

import jakarta.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hitel {

    private String nev;
    private float torleszto_osszeg;
    private float teljes_osszeg;
/*
    private String nev;
    private float osszeg;
    private String tipus;
    private int idotav;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public float getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(float osszeg) {
        this.osszeg = osszeg;
    }


    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getIdotav() {
        return idotav;
    }

    public void setIdotav(int idotav) {
        this.idotav = idotav;
    }


 */
}