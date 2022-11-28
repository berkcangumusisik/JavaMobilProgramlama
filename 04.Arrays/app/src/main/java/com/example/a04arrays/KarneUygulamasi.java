package com.example.a04arrays;

import java.util.Scanner;

public class KarneUygulamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dersler = new String[3];
        int[] notlar = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ders adı giriniz: ");
            dersler[i] = scanner.nextLine();
            System.out.print("Not giriniz: ");
            notlar[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int toplam = 0;
        for (int not : notlar) {
            toplam += not;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(dersler[i] + ": " + notlar[i]);
        }
        double ortalama = toplam / dersler.length;
        if (ortalama >= 50) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
