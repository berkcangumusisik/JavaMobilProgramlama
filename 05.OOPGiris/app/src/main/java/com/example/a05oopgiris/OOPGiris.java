package com.example.a05oopgiris;

public class OOPGiris {
    public static void main(String[] args) {
        Araba bmw = new Araba();
        bmw.hiz = 200;
        bmw.uzunluk = 2.05;
        bmw.renk = "Kırmızı";
        bmw.calisiyorMu = true;


        Araba tofas = new Araba();
        tofas.renk = "Beyaz";
        tofas.hiz = 100;
        tofas.uzunluk = 2.07;
        tofas.calisiyorMu = false;

        System.out.println("BMW");
        System.out.println(bmw.renk);
        System.out.println(bmw.hiz);
        System.out.println(bmw.uzunluk);
        System.out.println(bmw.calisiyorMu);

        System.out.println("----------------------");

        System.out.println("Tofaş");
        System.out.println(tofas.renk);
        System.out.println(tofas.hiz);
        System.out.println(tofas.uzunluk);
        System.out.println(tofas.calisiyorMu);

        System.out.println("BMW Çalışma : " + bmw.calisiyorMu);
        System.out.println("Tofaş Çalışma : " + tofas.calisiyorMu);

        bmw.hizlan(30);
        System.out.println(bmw.hiz);


    }
}

/*
Nesne Tabanlı Programlama
* Birden çok kez kullanım için nesneler soyutlanarak bilgisayar koduna dönüştürülür. Oluşan soyut taslaklara sınıf(class) denir
Nesne(Object) Nedir?
* Nesneler sınıfların soyutlaşmış halidir.
* Durumu(state) ve davranış biçimleri(behaviour) vardır.
* Durum (state): Arabanın rengi, hızı, kapasitesi.
* Davranış(behaviour) : Hızlanmak ve yavaşlamaj için pedallar

Sınıf Tanımlama:
* erişimBelirteci class Isim{
}

Nesnenin bir sınıftan Somutlaştırılması
sinifIsmi degiskenAdi = new sinifIsmi();
degiskenAdi.metod();
 */