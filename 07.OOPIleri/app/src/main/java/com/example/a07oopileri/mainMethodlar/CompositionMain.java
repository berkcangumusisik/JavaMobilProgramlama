package com.example.a07oopileri.mainMethodlar;

import com.example.a07oopileri.siniflar.Adresler;
import com.example.a07oopileri.siniflar.Kisiler;

public class CompositionMain {
    public static void main(String[] args) {
        Adresler adresler = new Adresler("İstanbul", "Kadıköy");
        Kisiler kisi = new Kisiler("Ahmet", 123456789, adresler);

        System.out.println("Kişi: " + kisi.getIsim());
        System.out.println("Telefon: " + kisi.getTel());
        System.out.println("İl: " + kisi.getAdresler().getIl());
        System.out.println("İlçe: " + kisi.getAdresler().getIlce());


    }
}
