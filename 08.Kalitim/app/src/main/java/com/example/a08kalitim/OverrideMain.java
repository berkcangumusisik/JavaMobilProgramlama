package com.example.a08kalitim;

public class OverrideMain {
    public static void main(String[] args) {
        Kopek kopek = new Kopek();
        Kedi kedi = new Kedi();
        Hayvan hayvan = new Hayvan();
        Memeliler memeli = new Memeliler();

        kopek.sesCikar();
        kedi.sesCikar();
        hayvan.sesCikar();
        memeli.sesCikar();

        Hayvan hayvan2 = new Kopek();
        hayvan2.sesCikar();
    }
}


/*
Polymorphism (Çok Biçimlilik)
* Referans tipindeki bir değişken aynı tipten bir nesneyi gösterebilirken, alt sınıflardan da nesneleri gösterebilir.
* Değişken tipi hangi metodun çağrılacağını belirler.
* Animal animal = new Dog(); // Animal tipindeki animal değişkeni Dog tipindeki nesneyi gösteriyor.
 */