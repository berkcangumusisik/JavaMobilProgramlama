package com.example.a06oopornekleri;

import java.util.Scanner;

public class CevreHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kısa kenar: ");
        int kisaKenar = scanner.nextInt();
        System.out.print("Uzun kenar: ");
        int uzunKenar = scanner.nextInt();

        CevreHesabi cevreHesabi = new CevreHesabi();
        cevreHesabi.cevreHesapla(kisaKenar, uzunKenar);
    }

    public void cevreHesapla(int kisaKenar, int uzunKenar){
        int cevre = (kisaKenar + uzunKenar) * 2;
        System.out.println("Çevre: " + cevre);
    }

}

/**
 * Konsoldan girilen kısa kenar ve uzun kenar değerlerine göre dikdörtgenin çevresini hesaplayan metodu yazınız.
 */