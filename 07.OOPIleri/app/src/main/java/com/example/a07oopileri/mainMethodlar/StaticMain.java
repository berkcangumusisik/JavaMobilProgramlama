package com.example.a07oopileri.mainMethodlar;

import com.example.a07oopileri.siniflar.Matematik;
import com.example.a07oopileri.siniflar.Personel;

public class StaticMain {
    public static void main(String[] args) {
        Matematik matematik = new Matematik();
        System.out.println("Toplama: " + matematik.topla(5, 6));

        Personel personel = new Personel("Ahmet", 25);
        System.out.println("Personel sayısı: " + Personel.getSayac());
        Personel personel2 = new Personel("Mehmet", 30);
        System.out.println("Personel sayısı: " + Personel.getSayac());
        Personel personel3 = new Personel("Ayşe", 35);
        System.out.println("Personel sayısı: " + Personel.getSayac());
    }
}
