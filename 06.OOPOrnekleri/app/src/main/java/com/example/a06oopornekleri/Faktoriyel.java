package com.example.a06oopornekleri;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        Faktoriyel faktoriyel = new Faktoriyel();
        faktoriyel.faktoriyelHesapla(sayi);

    }

    public void faktoriyelHesapla(int sayi){
        int faktoriyel = 1;
        if(sayi == 0){
            faktoriyel = 1;
        }
        else{
            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
            }
        }
        System.out.println("Faktoriyel: " + faktoriyel);
    }
}


/*
Faktöriyel hesaplayan metodu yazınız. Konsoldan girilen sayının faktöriyelini hesaplayan faktöriyelHesapla() metodunu yazınız ve parametre olarak sayı giriniz.
 */