package org.example;

import java.util.Scanner;

public class SeleksiPerguruanTinggi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scn.nextInt();
        String perguruanTinggi = "";

        if (nilai >= 81) {
            perguruanTinggi = "PT A";
        } else if (nilai >= 71 && nilai <= 80) {
            perguruanTinggi = "PT B";
        } else if (nilai >= 61 && nilai <= 70) {
            perguruanTinggi = "PT C";
        } else if (nilai <= 60) {
            perguruanTinggi = "PT D";
        }

        System.out.println("Anda dapat masuk ke " + perguruanTinggi);
    }
}
