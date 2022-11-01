package org.example;

import java.util.Scanner;

// InchToCentimeter merupakan class
class InchToCentimeter {
    // float merupakan tipe data primitive
    // measurement merupakan identifier yang juga attribute dari class
    float measurement;

    // InchToCentimeter merupakan initialize method
    public InchToCentimeter(float measurement) {
        this.measurement = measurement;
    }

    // convert merupakan method
    public float convert() {
        return measurement * 2.54f;
    }
}

public class Converter {
    public static void main(String[] args) {
        // Scanner merupakan tipe data reference
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan pengukuran dalam inch: ");
        float input = scn.nextFloat();
        // inchToCentimeter merupakan object dari class InchToCentimeter
        InchToCentimeter inchToCentimeter = new InchToCentimeter(input);
        // convert() merupakan method call
        float result = inchToCentimeter.convert();
        System.out.println("Hasil konversi: " + result + " cm");
    }
}
