package com.example.a03donguler;

import java.util.Scanner;

public class TekCiftSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Sayı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi % 2 == 0){
                System.out.println("Çift sayı");
            } else {
                System.out.println("Tek sayı");
            }
        }
    }
}
