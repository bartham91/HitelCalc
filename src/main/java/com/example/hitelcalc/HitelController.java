package com.example.hitelcalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.jdbi.v3.core.Jdbi;

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



    public void szamol(ActionEvent actionEvent) {
        eredmeny.setText(hitelcalculator.Kamat(elso.getText(), masodik.getText(), harmadik.getText()));
        eredmeny1.setText(hitelcalculator.Visszafiz(elso.getText(), masodik.getText(), harmadik.getText()));
        Hitel hitel = new Hitel();
        System.out.println("csatlakozas..");

        //Jdbi jdbi = Jdbi.create("jdbc:h2:mem:test");

    }

}