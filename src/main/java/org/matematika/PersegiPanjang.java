package org.matematika;

public class PersegiPanjang extends Matematika {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public int luas() {
        return panjang * lebar;
    }
}
