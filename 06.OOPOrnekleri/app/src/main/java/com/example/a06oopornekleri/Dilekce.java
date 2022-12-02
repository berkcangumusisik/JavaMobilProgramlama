package com.example.a06oopornekleri;

import java.util.Scanner;

public class Dilekce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınız: ");
        String ad = scanner.nextLine();
        System.out.print("Öğrenci numaranız: ");
        int ogrenciNo = scanner.nextInt();
        System.out.print("İzin gün sayısı: ");
        int izinGunu = scanner.nextInt();
        System.out.print("Veli adı: ");
        String veliAd = scanner.next();

    }

    public void dilekceYazdir(String ad, int ogrenciNo, int izinGunu, String veliAd){
        String dilekce = "\t\tBursa Anadolu Lisesi Müdürlüğüne \n" + ad + " adlı öğrencimizin " + ogrenciNo + " numaralı öğrenci kimlik kartı ile " + izinGunu + " gün izinli olmasını rica ediyorum. " + veliAd + " adlı velimizin de bilgisi dahilindedir.";
    }
}

/*
Hazır dilekçe örneği doldurma işle yapılacak. İlgili yerlere konsoldan girilen bilgiler yazılacak.
dilekceOlustur() metodunu yazınız. Parametre olarak ad, no, izin gün miktarı, tarih ve veli adı giriniz.
 */