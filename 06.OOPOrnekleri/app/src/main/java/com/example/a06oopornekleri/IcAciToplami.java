package com.example.a06oopornekleri;

import java.util.Scanner;

public class IcAciToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kenar sayısı giriniz: ");
        int kenarSayisi = scanner.nextInt();
        IcAciToplami icAciToplami = new IcAciToplami();
        icAciToplami.icAciToplami(kenarSayisi);
    }

    public void icAciToplami(int kenarSayisi){
        int icAciToplami = (kenarSayisi - 2) * 180;
        System.out.println("İç açı toplamı: " + icAciToplami);
    }
}
/*
Geometrik cisimlerin iç açıları toplamını hesaplayan icAciToplami() metodunu yazınız. Parametre olarak kenar sayısı giriniz.
Formül
n : kenar sayısı
180.(n-2)
 */