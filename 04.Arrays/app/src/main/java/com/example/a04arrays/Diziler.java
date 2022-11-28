package com.example.a04arrays;

import java.util.Arrays;

public class Diziler {
    public static void main(String[] args) {
        int[] plakalar = new int[5];
        plakalar[0] = 34;
        plakalar[1] = 35;
        plakalar[2] = 36;
        plakalar[3] = 37;
        System.out.println(Arrays.toString(plakalar));

        String[] meyveler = {"Elma", "Armut", "Muz", "Kivi"};
        System.out.println(Arrays.toString(meyveler));

        double[] boylar = {1.80, 1.70, 1.90, 1.60};
        System.out.println(Arrays.toString(boylar));

        System.out.println(boylar[0]);

        meyveler[0] = "Karpuz";
        System.out.println(Arrays.toString(meyveler));

        String[] sehirler = {"Ankara", "İstanbul", "İzmir", "Bursa"};
        for (int i = 0; i < sehirler.length; i++) {
            System.out.println(sehirler[i]);
        }

        System.out.println("---------------");

        String[] isimler = {"Ahmet", "Mehmet", "Ayşe", "Fatma"};
        for (String isim : isimler) {
            System.out.println(isim);
        }

        System.out.println("---------------");

        Arrays.sort(isimler);
        for (String isim : isimler) {
            System.out.println(isim);
        }

        System.out.println("---------------");

        int[] sayilar = {5, 3, 1, 4, 2};
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
        Arrays.sort(sayilar);
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
    }
}

/*
* Array: Diziler
* Diziler, birden fazla veriyi bir arada tutmak için kullanılır.
* Diziler, aynı türden verileri bir arada tutmak için kullanılır.
* İlk elemanın indeksi 0'dır.
* Veriler önceden tanımlanacaksa : veriTipi[] diziAdi = {veri1, veri2, veri3, ...};
* Veriler sonradan tanımlanmayacaksa : veriTipi[] diziAdi = new veriTipi[veriSayisi];
* .length => Dizinin eleman sayısını verir.
* Arrays.sort() => Dizinin elemanlarını küçükten büyüğe sıralar.
 */