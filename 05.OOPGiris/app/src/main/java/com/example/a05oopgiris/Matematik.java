package com.example.a05oopgiris;

public class Matematik {

    public static void main(String[] args) {
        Matematik m1 = new Matematik();
        m1.carpma(3,5);

        int gelenDeger = m1.topla(3,6,90);
        System.out.println(gelenDeger);

        int cikarma = m1.cikarma(5,3,"Berkcan");
        System.out.println(cikarma);

    }
    public void carpma(int sayi1, int sayi2){
        int sonuc = sayi1 * sayi2;
        System.out.println(sonuc);
    }

    public int topla(int sayi1, int sayi2,int sayi3){
        int sonuc = sayi1 + sayi2 + sayi3;
        return sonuc;
    }

    public int cikarma(int sayi1, int sayi2,String isim){
        int sonuc = sayi1 - sayi2;
        System.out.println("İşlemi yapan "  + isim);
        return sonuc;
    }
}
