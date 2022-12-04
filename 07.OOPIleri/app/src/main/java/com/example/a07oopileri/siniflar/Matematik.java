package com.example.a07oopileri.siniflar;

public class Matematik {
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }


}

/*
Static Değişkenler
* Değişkenin bir kopyasının tüm sınıflar ve nesneler tarafından paylaşılmasını sağlar.
Örnek: Math.max, Math.min, Math.PI, Math.E
* Kullanılması gereken durumlar:
    * Bir sınıfın tüm nesnelerinin aynı değişken değerini kullanması gerektiği durumlarda.
    * Bir değişkenin, bulunduğu sınıftan bir nesne oluşturulması gerekmeden erişilmesi gerektiği durumlarda.
 */
