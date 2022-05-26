package com.example.hitelcalc;

import javafx.application.Application;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import static com.example.hitelcalc.JAXBHelper.toXML;

public class Main {
    public static void main(String[] args) throws Exception {

        Application.launch(HitelApplication.class, args);
    }
}
