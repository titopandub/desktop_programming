package org.example;

public class overloading{
    public void segitiga(){
        int alas=5, tinggi=10;
        System.out.println("Luas segitiga satu = "+(alas*tinggi)/2);
    }

    public void segitiga(int x, int y){
        System.out.println("Luas segitiga dua = "+(x*y)/2);
    }

    public static void main(String [] args){
        System.out.println("Contoh Overloading");
        System.out.println("");
        overloading s3;
        s3 = new overloading();
        s3.segitiga();
        s3.segitiga(20,8);
    }
}