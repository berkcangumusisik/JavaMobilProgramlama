package com.example.a05oopgiris;

public class MatematikselHesaplama {
    public static void main(String[] args) {
        MatematikselHesaplama mh = new MatematikselHesaplama();
        mh.topla(3,4,5);

    }

    public void topla(int sayi1, int sayi2){
        System.out.println(sayi1 + sayi2);
    }

    public void topla(double sayi1, int sayi2){
        System.out.println(sayi1 + sayi2);
    }

    public void topla(int sayi1, double sayi2){
        System.out.println(sayi1 + sayi2);
    }

    public void topla(int sayi1, int sayi2, int sayi3){
        System.out.println(sayi1 + sayi2+ sayi3);
    }
}
/*
Birden fazla metod aynı isimde farklı parametre ya da tipte veri alabilir.
 */