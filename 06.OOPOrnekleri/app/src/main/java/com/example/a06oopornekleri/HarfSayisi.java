package com.example.a06oopornekleri;

import java.util.Scanner;

public class HarfSayisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        System.out.print("Harf giriniz: ");
        char harf = scanner.next().charAt(0);

        HarfSayisi harfSayisi = new HarfSayisi();
        harfSayisi.harfSayisiBul(cumle, harf);

    }
    public void harfSayisiBul(String cumle, char karakter){
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i) == karakter){
                sayac++;
            }
        }
        System.out.println("Harf sayısı: " + sayac);
    }


}
/*
Konsoldan girilen kelimenin içinde istenen girilen harf sayısını bulan harfSayisiBul() metodunu yazınız. Parametre olarak kelime ve harfi giriniz.
 */