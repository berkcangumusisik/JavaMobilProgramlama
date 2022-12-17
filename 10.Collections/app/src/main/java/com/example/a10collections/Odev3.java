package com.example.a10collections;

import java.util.Random;
import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random uret = new Random();
        int sayi = uret.nextInt(101);
        int hak = 5;
        while (hak > 0){
            System.out.print("Tahmininizi giriniz: ");
            int tahmin = scanner.nextInt();
            if (tahmin == sayi){
                System.out.println("Tebrikler bildiniz.");
                break;
            }else if (tahmin > sayi){
                System.out.println("Daha küçük bir sayı giriniz.");
            }else{
                System.out.println("Daha büyük bir sayı giriniz.");
            }
            hak--;
        }

        if (hak == 0) {
            System.out.println("Hakkınız bitti. Sayı: " + sayi);
        }
    }
}

/*
Rastgele bir sayı 0 ile 100 arasında üretilecek 5 tahmin hakkınız olacak,
her tahminde size yardımcı olacak bir mesaj verilecek. Yukarı veya aşağı gibi.
Doğru tahmin edilirse tebrikler kazandınız yazacak. Tahminler yanlış olursa
kaybettiniz yazacak. Kazanma durumunda ve kaybetme durumunda geçmiş tahminler
arraylistte tutulacak ve ekrana yazdırılacak.
 */