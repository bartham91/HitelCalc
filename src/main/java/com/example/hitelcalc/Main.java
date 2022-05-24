package com.example.hitelcalc;

import javafx.application.Application;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import static com.example.hitelcalc.JAXBHelper.toXML;

public class Main {
    public static void main(String[] args) throws Exception {
        ///////////////////
/*
        Hitel hitel = new Hitel();
        hitel.setNev("Mate");
        hitel.setOsszeg(200);
        hitel.setTipus("valtozo");
        hitel.setIdotav(24);


        System.out.println(hitel);

        toXML(hitel, System.out);
        //toXML(hitel2, System.out);
        toXML(hitel, new FileOutputStream("hitel.xml"));
        //toXML(hitel2, new FileOutputStream("hitel.xml"));
        System.out.println(JAXBHelper.fromXML(Hitel.class, new FileInputStream("hitel.xml")));

*/
        /////////////
        Application.launch(HitelApplication.class, args);
    }
}
