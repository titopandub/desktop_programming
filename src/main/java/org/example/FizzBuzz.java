package org.example;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Berikan angka positif: ");
        int number = scn.nextInt();
        System.out.println("Inilah deret FizzBuzz: ");

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
