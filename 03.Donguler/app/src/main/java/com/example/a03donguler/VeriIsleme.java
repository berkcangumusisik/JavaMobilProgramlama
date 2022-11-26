package com.example.a03donguler;

import java.util.Scanner;

public class VeriIsleme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İşlenecek veri miktarını giriniz: ");
        int veriMiktari = scanner.nextInt();

        while (veriMiktari > 0) {
            System.out.print("Veri giriniz: ");
            int veri = scanner.nextInt();
            System.out.println("Veri: " + veri);
            veriMiktari--;
        }
    }
}
