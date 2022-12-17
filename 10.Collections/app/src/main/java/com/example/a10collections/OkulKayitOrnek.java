package com.example.a10collections;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulKayitOrnek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

        while (true){
            System.out.print("Öğrenci okul numarasını giriniz: ");
            int okulNo = scanner.nextInt();

            System.out.print("Öğrenci adını giriniz: ");
            String ad = scanner.next();
            Ogrenci yeniOgrenci = new Ogrenci(okulNo, ad);
            ogrenciler.add(yeniOgrenci);

            System.out.println(("Çıkış 1 - Devam Diğer Sayılar"));
            int secim = scanner.nextInt();
            if (secim == 1){
                for (Ogrenci ogrenci : ogrenciler) {
                    System.out.println("----------------");
                    System.out.println("Okul No: " + ogrenci.getTcNo());
                    System.out.println("Ad: " + ogrenci.getAd());
                }
                break;
            }
        }
    }
}
