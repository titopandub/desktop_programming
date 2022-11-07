package org.example;

public class Bilangan {
    public static void main(String[] args){
        System.out.print("Bilangan Genap dari 1 - 30 : ");
        for(int x = 1; x <= 30; x++){
            if(x % 2 == 0 )
                System.out.print(" " + x);
        }
    }
}
