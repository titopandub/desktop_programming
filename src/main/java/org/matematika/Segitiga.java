package org.matematika;

public class Segitiga extends Matematika {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public int luas() {
        return alas * tinggi;
    }
}
