package com.example.a03donguler;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("--------------------");
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        // 3 ile 6 arasında 3,4,5,6 sayılarını yazdırınız.
        System.out.println("--------------------");
        for (int j = 3; j <= 6; j++) {
            System.out.println("j = " + j);
        }
    }
}

/*
1. for Döngüsü
- for döngüsü, belirli bir sayıda tekrarlanan işlemler için kullanılır.
for (başlangıç; kontrol; artırma) {
    // yapılacak işlemler
}

2. while Döngüsü
- while döngüsü, belirli bir koşul sağlandığı sürece tekrarlanan işlemler için kullanılır.
while (koşul) {
    // yapılacak işlemler
}
 */