package com.example.a01degiskenveveriturleri;

public class Degiskenler {
    public static void main(String[] args) {
        // Bir	öğrencini adını ,yaşını	,boyunu	ve	adının	baş	harfininin tutulduğu değişken oluşturunuz.
        String ad = "Ahmet";
        int yas = 20;
        float boy = 1.80f;
        char ilkHarf = 'A';
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Boy:  " + boy);

        /**Bir	şirketin	ürünlerinin	bilgilerinin	tutulduğu	ürünler
         tablosunu	temsil	eden	değişkenleri	oluşturunuz*/
        String urunAdi = "Laptop";
        int urunKodu = 12345;
        double urunFiyati = 5000.0;
        String urunAciklamasi = "16 GB Ram";
        System.out.println("Ürün Adı: " + urunAdi);
        System.out.println("Ürün Kodu: " + urunKodu);
        System.out.println("Ürün Fiyatı: " + urunFiyati);
        System.out.println("Ürün Açıklaması: " + urunAciklamasi);

        int sayi1 = 30;
        int sayi2 = sayi1;
        sayi1 = sayi1 + 5;
        System.out.println("Sayi1: " + sayi1);
        System.out.println("Sayi2: " + sayi2);

        int x = 10;
        int y = 20;
        y = x;
        x = 80;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
/**
 * Modern diller hafızada saklanan değerleri değişkenler ile ifade ederler.
 * Değişkenler hafızada geçici olarak saklanan değerlerdir.
 Değişken Tanımlama
 * veriTuru degiskenAdi = deger;
 * int yas = 20;

 Veri Tipleri
 1. Sayısal Veri Tipleri
 * byte : 1 byte (8 bit) -128 ile 127 arasında değer alır.
 * short : 2 byte (16 bit) -32768 ile 32767 arasında değer alır.
 * int : 4 byte (32 bit) -2 milyar ile 2 milyar arasında değer alır.
 * long : 8 byte (64 bit) -9 milyar ile 9 milyar arasında değer alır.

 2. Ondalıklı Sayısal Veri Tipleri
 * float : 4 byte (32 bit) 7 basamaklı ondalıklı sayıları saklar.Sonuna f veya F eklenir.
 * double : 8 byte (64 bit) 15 basamaklı ondalıklı sayıları saklar. Sonuna d veya D eklenir.

 3. Character Veri Tipi
 * char : 2 byte (16 bit) tek bir karakteri saklar. Tek tırnak içerisinde yazılır.

 4. Boolean Veri Tipi
 * boolean : 1 byte (8 bit) true veya false değerlerini saklar.
 *
 Değişkenlere	isim	verme	kuralları
 *  Case	sensitive’dir.Büyük küçük	harf	farkı	vardır.
 *  Rakamla	başlayamaz.
 *  Boşluk	içeremez.
 *  Türkçe	karakter	içeremez.
 *  $ ve _	sembollerini	kullanabiliriz.
 *  Sınıf	isimleri	büyük	harf	ile	başlar.
 */