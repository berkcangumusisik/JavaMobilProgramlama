package com.example.a04arrays;

import java.util.Random;

public class HazirKomutlar {
    public static void main(String[] args) {
        int i = -5;
        System.out.println("Mutlak Değer: " + Math.abs(i));
        System.out.println("En Büyük Değer: " + Math.max(5, 10));
        System.out.println("En Küçük Değer: " + Math.min(5, 10));
        System.out.println("Karekök: " + Math.sqrt(25));
        System.out.println("Üs Alma: " + Math.pow(2, 3));
        System.out.println("Pi Sayısı: " + Math.PI);
        System.out.println("E Sayısı: " + Math.E);


        // Random sayı üretme
        Random random = new Random();
        int sayi = random.nextInt(100);
        System.out.println("Rastgele Sayı: " + sayi);

    }
}
