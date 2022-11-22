package com.example.a02kararyapilari;

import java.util.Scanner;

public class DortIslem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesap Makinesine Hoşgeldiniz");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");

        System.out.println("Hangi işlemi yapmak istiyorsunuz?");
        int islem = scanner.nextInt();

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        if (islem == 1){
            int toplam = sayi1 + sayi2;
            System.out.println("Toplam: " + toplam);
        }else if (islem == 2){
            int fark = sayi1 - sayi2;
            System.out.println("Fark: " + fark);
        }else if (islem == 3){
            int carpim = sayi1 * sayi2;
            System.out.println("Çarpım: " + carpim);
        }else if (islem == 4){
            int bolum = sayi1 / sayi2;
            System.out.println("Bölüm: " + bolum);
        }else{
            System.out.println("Geçersiz işlem");
        }

    }
}
