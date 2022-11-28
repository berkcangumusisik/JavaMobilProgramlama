package com.example.a04arrays;

import java.util.Scanner;

public class DizilereKonsolGirdisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int sayiMiktari = scanner.nextInt();
        int[] sayilar = new int[sayiMiktari];
        for (int i = 0; i < sayiMiktari; i++) {
            System.out.print("Sayı giriniz: ");
            sayilar[i] = scanner.nextInt();
        }
        for (int sayi : sayilar) {
            System.out.println("Sayı: " + sayi);
        }
    }
}
