package com.example.a01degiskenveveriturleri;

public class AritmetikOperatorler {
    public static void main(String[] args) {
        // Daire alanını değişkenler oluşturarak hesaplayınız.
        double daireAlani;
        double pi = 3.14;
        int yariCap = 2;
        daireAlani = pi * yariCap * yariCap;
        System.out.println("Dairenin alanı: " + daireAlani);

        //• F = m x a Uygulanan	Kuvvet(F)=	Cismin	kütlesi(m)	x cismin	ivmesi	(a)

        double kuvvet;
        double m = 67;
        double a = 10;
        kuvvet = m * a;
        System.out.println("Kuvvet: " + kuvvet);


        int x ;
        int v = 30;
        int v0 = 40;
        int t = 5;
        x = ((v + v0) / 2) * t;
        System.out.println("x: " + x);

        double x2 = (v0 * t) + (a * t * t) / 2;
        System.out.println("x2: " + x2);

        int toplam = 80;
        toplam += 10; // toplam = toplam + 10;
        System.out.println("Toplam: " + toplam);

        int carpma = 80;
        carpma *= 10; // carpma = carpma * 10;
        System.out.println("Çarpma: " + carpma);

        int sayi1 = 4;
        int sayi2 = ++sayi1; // sayi1 = 5; sayi2 = 5;
        int sayi3 = --sayi1; // sayi1 = 4; sayi3 = 4;
        System.out.println("Sayı 1: " + sayi1);
        System.out.println("Sayı 2: " + sayi2);
        System.out.println("Sayı 3: " + sayi3);

        int k = 5;
        int l = k++;
        int n = k--;
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("n: " + n);
    }
}
/*
Aritmetik Operatörler
* Toplama +
* Çıkarma -
* Çarpma *
* Bölme /
* Mod %
* Arttırma ++
* Azaltma --


 */