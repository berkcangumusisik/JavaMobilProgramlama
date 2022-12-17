package com.example.a10collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> meyveler = new HashSet<>();
        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Kiraz");
        meyveler.remove("Elma");
        for (String meyve : meyveler) {
            System.out.println(meyve);
        }


        HashSet<Ogrenci> ogrenciler = new HashSet<>();
        ogrenciler.add(new Ogrenci(123, "Ahmet"));
        ogrenciler.add(new Ogrenci(456, "Mehmet"));
        ogrenciler.add(new Ogrenci(789, "Ayşe"));
        System.out.println(ogrenciler);

        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println(ogrenci.getAd());
        }
    }
}

/*
HashSet
* Küme mantığı ile çalışır.
* Aynı eleman birden fazla kez eklenemez.
* Yalnızca bir null değeri eklenir.
* Elemanlar eklenme sırasına göre sıralanmaz.
* Bir diziye veya ArrayList'e dönüştürülerek sıralanabilir.
 */
