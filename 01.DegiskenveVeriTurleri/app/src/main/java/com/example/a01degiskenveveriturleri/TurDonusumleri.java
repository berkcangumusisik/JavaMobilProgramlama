package com.example.a01degiskenveveriturleri;

public class TurDonusumleri {
    public static void main(String[] args) {
        // Explicit (Bilinçli) Dönüşüm
        double d = 10.5;
        long l = (long) d;
        int i = (int) l;
        System.out.println("Double: " + d);
        System.out.println("Long: " + l);
        System.out.println("Int: " + i);

        // UnExplicit (Bilinçsiz) Dönüşüm
        int x = 4;
        long y = x;
        double z = y;
        System.out.println("Int: " + x);
        System.out.println("Long: " + y);
        System.out.println("Double: " + z);


        // Sayısaldan Stringe Dönüşüm
        int sayi = 10;
        String yazi1 = String.valueOf(sayi);
        String yazi2 = Integer.toString(sayi);
        String yazi3 = sayi + "";
        System.out.println("String: " + yazi1);
        System.out.println("String: " + yazi2);
        System.out.println("String: " + yazi3);

        // Stringden Sayısala Dönüşüm
        String yazi4 = "10";
        int sayi2 = Integer.parseInt(yazi4);
        int sayi3 = Integer.valueOf(yazi4);
        System.out.println("Int: " + sayi2);
        System.out.println("Int: " + sayi3);
    }
}
/*
Sayısal Dönüşümler
* Reel sayılar(float,double) tam sayıya dönüşürken kesirli kısımlar silinir. Veri kaybı olur.

Sayısaldan Stringe Dönüşüm
* String.valueOf() veya Integer.toString() metodu ile sayısal veriler stringe dönüştürülebilir.

Stringden Sayısala Dönüşüm
* Integer.parseInt() veya Double.parseDouble() metodu ile string veriler sayısal verilere dönüştürülebilir.
 */