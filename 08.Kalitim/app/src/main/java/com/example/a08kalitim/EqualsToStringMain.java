package com.example.a08kalitim;

public class EqualsToStringMain {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci(1, "Ahmet");
        Ogrenci ogrenci2 = new Ogrenci(2, "Zeynep");
        Ogrenci ogrenci3 = new Ogrenci(3, "Mehmet");
        Ogrenci ogrenci4 = new Ogrenci(5, "Mehmet");

        System.out.println(ogrenci1);
        System.out.println(ogrenci1);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        if (ogrenci3.equals(ogrenci4)) {
            System.out.println("Eşit");
        } else {
            System.out.println("Eşit değil");
        }
    }
}
