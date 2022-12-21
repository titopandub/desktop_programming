package org.matematika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Matematika> matematikaList = new ArrayList<>(Arrays.asList(
                new Segitiga(10, 5),
                new PersegiPanjang(15, 3),
                new Segitiga(3, 10),
                new PersegiPanjang(10, 4)
        ));

        for (Matematika matematika : matematikaList) {
            int luas = matematika.luas();
            System.out.println(
                    "Luas " + matematika.getClass().getSimpleName() + ": " + luas
            );
        }

    }
}
