package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan harga pembelian: ");
        float price = scn.nextFloat();

        float discount = 0.0f;
        float discountedPrice;
        if (price > 50000.0f) {
            discount = 20.0f;
        }
        discountedPrice = discount / 100.f * price;
        float total = price - discountedPrice;

        Locale locale = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        System.out.println("Price : " + numberFormat.format(price));
        System.out.println("Discount " + Math.round(discount) + "% : " + numberFormat.format(discountedPrice));
        System.out.println("Total (after discount) : " + numberFormat.format(total));
    }
}
