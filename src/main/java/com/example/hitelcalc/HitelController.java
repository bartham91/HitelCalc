package com.example.hitelcalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class HitelController {

    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/

    @FXML
    private Label eredmeny;

    @FXML
    private Label eredmeny1;

    @FXML
    private TextField userneve;


    @FXML
    private TextField elso;

    @FXML
    private TextField masodik;

    @FXML
    private TextField harmadik;

    private HitelCalculator hitelcalculator;


    @FXML
    public void initialize() {
        hitelcalculator = new HitelCalculator();
    }



    public void szamol(ActionEvent actionEvent) throws Exception {

        eredmeny.setText(hitelcalculator.Kamat(elso.getText(), masodik.getText(), harmadik.getText()));
        eredmeny1.setText(hitelcalculator.Visszafiz(elso.getText(), masodik.getText(), harmadik.getText()));

        //System.out.println(eredmeny);
        //System.out.println(eredmeny1);
        System.out.println("Jelenlegi XML adatok:");
        System.out.println(JAXBHelper.fromXML(Hitelek.class, new FileInputStream("hitel.xml")));
        Hitelek hitelek2 = new Hitelek();
        hitelek2=JAXBHelper.fromXML(Hitelek.class, new FileInputStream("hitel.xml"));
        var hitels2 = new ArrayList<Hitel>();
        hitels2= (ArrayList<Hitel>) hitelek2.getHitels();
        hitels2.add(new Hitel(userneve.getText(),Float.parseFloat(hitelcalculator.Kamat(elso.getText(), masodik.getText(), harmadik.getText())), Float.parseFloat(hitelcalculator.Visszafiz(elso.getText(), masodik.getText(), harmadik.getText()))));
        Hitelek hitelek = new Hitelek();
        hitelek.setHitel_name("hitelek_felsorolva");
        hitelek.setHitels(hitels2);
        JAXBHelper.toXML(hitelek, new FileOutputStream("hitel.xml"));
        System.out.println("Uj XML adatok:");
        System.out.println(hitelek);


        //Mikor eloszor futattom akkor kell ez, h legyen egy XML file, amit kesobb beolvas
       /* Hitelek hitelek2 = new Hitelek();
        hitelek2.setHitel_name("hitelek_felsorolva");
        var hitels2 = new ArrayList<Hitel>();
        hitels2.add(new Hitel("Mate", 15, 150));
        hitelek2.setHitels(hitels2);
        JAXBHelper.toXML(hitelek2, new FileOutputStream("hitel.xml"));
        System.out.println(JAXBHelper.fromXML(Hitelek.class, new FileInputStream("hitel.xml")));

*/
    }

}