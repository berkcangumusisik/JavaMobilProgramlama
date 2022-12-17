package com.example.a10collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        System.out.println(list);

        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Kiraz");
        System.out.println(meyveler);
        for (String meyve : meyveler) {
            System.out.println(meyve);
        }

        meyveler.remove("Elma");
        meyveler.add(1, "Kivi");
        System.out.println(meyveler);

        List<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci(123, "Ahmet"));
        ogrenciler.add(new Ogrenci(456, "Mehmet"));
        ogrenciler.add(new Ogrenci(789, "Ayşe"));
        System.out.println(ogrenciler);

        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println(ogrenci.getAd());
        }

        Collections.sort(meyveler);
    }
}

/*
ArrayList
* Sıralama eleman eklenme sırasına göre yapılır.
* Aynı eleman birden fazla kez eklenebilir.
* Elemanlara index numarası ile erişilebilir.
* Dizilerden farklı olarak boyutu değişebilir.
* .add() ile eleman eklenebilir.
* .remove() ile eleman silinebilir.
* Collections.sort() ile elemanlar sıralanabilir.z
 */