package com.example.hitelcalc;

import java.lang.Math;

public class HitelCalculator {

    public String Kamat(String a, String b, String c){

        return Double.toString((Double.parseDouble(a) * (Double.parseDouble(c)/12)) / (1-1/Math.pow((1+(Double.parseDouble(c)/12)), Double.parseDouble(b))));
    }

    public String Visszafiz(String a, String b, String c){

        return Double.toString((Double.parseDouble(a) * (Double.parseDouble(c)/12)) / (1-1/Math.pow((1+(Double.parseDouble(c)/12)), Double.parseDouble(b)))* Double.parseDouble(b));
    }


}
