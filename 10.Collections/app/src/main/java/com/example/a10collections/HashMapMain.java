package com.example.a10collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<Integer, String> sehirler = new HashMap<>();
        sehirler.put(34, "İstanbul");
        sehirler.put(06, "Ankara");
        sehirler.put(35, "İzmir");

        Set<Integer> plakalar = sehirler.keySet();
        for (Integer plaka : plakalar) {
            System.out.println(plaka + " " + sehirler.get(plaka));
        }

        HashMap<Integer, Ogrenci> ogrenciler = new HashMap<>();
        ogrenciler.put(123, new Ogrenci(123, "Ahmet"));
        ogrenciler.put(456, new Ogrenci(456, "Mehmet"));
        ogrenciler.put(789, new Ogrenci(789, "Ayşe"));

        Set<Integer> ogrenciNo = ogrenciler.keySet();
        for (Integer no : ogrenciNo) {
            System.out.println(no + " " + ogrenciler.get(no).getAd());
        }
    }
}
/*
HashMap
* Anahtar ve değerlerden oluşur.
* Anahtar ve değerlerin birbirine eşleşmesi gerekir.
* Her anahtar bir kez kullanılabilir.
* Değerlere anahtarlar üzerinden erişilir.
* Değerler eklenme sırasına göre sıralanmaz.

 */