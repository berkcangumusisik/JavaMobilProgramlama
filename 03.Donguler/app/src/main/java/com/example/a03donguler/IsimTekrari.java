package com.example.a03donguler;

import java.util.Scanner;

public class IsimTekrari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsminizi giriniz: ");
        String isim = scanner.nextLine();
        System.out.print("Kaç kere tekrar edilsin: ");
        int tekrar = scanner.nextInt();
        for (int i = 0; i < tekrar; i++) {
            System.out.println("Merhaba " + isim);
        }
    }
}
