package com.example.a10collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Odev1 {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        Random uret = new Random();
        for (int i = 0; i < 10; i++) {
            int rastgeleSayi = uret.nextInt(101);
            sayilar.add(rastgeleSayi);
        }

        Collections.sort(sayilar);

        for (Integer sayi : sayilar) {
            System.out.println(sayi);
        }
    }
}

/*
0 ile 100 arasında sayılar üreterek bir ArrayList'e ekleyin. Küçükten büyüğe sıralayın.
 */