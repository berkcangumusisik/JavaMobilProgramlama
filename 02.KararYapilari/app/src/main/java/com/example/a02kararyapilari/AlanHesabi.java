package com.example.a02kararyapilari;

import java.util.Scanner;

public class AlanHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alan Hesabına Hoşgeldiniz");
        System.out.println("1-Daire Alanı Hesaplama");
        System.out.println("2-Dikdörtgen Alanı Hesaplama");

        int tercih = scanner.nextInt();
        if (tercih == 1 ){
            System.out.print("Dairenin yarıçapını giriniz: ");
            double yaricap = scanner.nextDouble();
            double alan = Math.PI * yaricap * yaricap;
            System.out.println("Dairenin alanı: " + alan);
        }else if (tercih == 2) {
            System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
            int uzunKenar = scanner.nextInt();
            System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
            int kisaKenar = scanner.nextInt();
            int alan = uzunKenar * kisaKenar;
            System.out.println("Dikdörtgenin alanı: " + alan);
        }else
            System.out.println("Geçersiz Tercih");

    }
}

/*
Seçim Yapınız
(1) Daire Alanı Hesaplama
(2) Dikdörtgen Alanı Hesaplama
 */