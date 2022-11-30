package com.example.a05oopgiris;

public class ConstructorMain {
    public static void main(String[] args) {
        Ogrenciler ogrenci = new Ogrenciler();
        ogrenci.adres = "Ankara";
        ogrenci.isim = "Berkcan";
        ogrenci.okulNo = 1234;


        Ogrenciler ogrenci2 = new Ogrenciler("Ahmet",12345,"İstanbul");

        int sayi1 = 40;
        int sayi2 = sayi1;
        sayi1 = 50;
        System.out.println(sayi1);
        System.out.println(sayi2);

        Ogrenciler ogrenci3 = new Ogrenciler();
        ogrenci.isim = "Mehmet";
        System.out.println(ogrenci3.isim);
        Ogrenciler ogrenci4 = ogrenci3;
        ogrenci4.isim = "Zeynep";
        System.out.println(ogrenci3.isim);
        System.out.println(ogrenci4.isim);
    }
}
/*
Bir sınıfın değişkenlerini somutlaştırır.
Her sınıfın bir constructoru vardır
Tanımlandığında boştur.
PArametre alabilir.
Overload edilebilir.
 */