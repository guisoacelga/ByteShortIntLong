package com.company;

public class PoundsToKilos {
    public static void main(String[] args) {
        double nrPounds = 200d;
        double convertedKilos = 0;

        convertedKilos = nrPounds * 0.45359237d;
        System.out.println("Converted Kilograms : " + convertedKilos);
    }
}
