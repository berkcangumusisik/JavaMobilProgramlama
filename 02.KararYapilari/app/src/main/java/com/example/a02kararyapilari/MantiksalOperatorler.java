package com.example.a02kararyapilari;

public class MantiksalOperatorler {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;

        int y1 = 10;
        int y2 = 20;
        System.out.println(sayi1 == sayi2 && y1 == y2); // false
        System.out.println(sayi1 == sayi2 || y1 == y2); // true
        System.out.println(!(sayi1 == sayi2)); // true
    }
}

/**
 * Mantıksal Operatörler
 * && ve => iki koşulun da doğru olması durumunda true değeri döner.
 * || veya => iki koşuldan birinin doğru olması durumunda true değeri döner.
 * ! değil => koşulun tersini döner.
 */