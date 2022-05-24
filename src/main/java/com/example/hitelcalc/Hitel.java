package com.example.hitelcalc;

import lombok.Data;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Hitel {

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
}
