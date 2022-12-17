package com.example.a10collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Personel> personeller = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Personel No: ");
            int personelNo = scanner.nextInt();
            System.out.print("Personel Ad: ");
            String isim = scanner.next();
            System.out.print("Personel Adres il: ");
            String il = scanner.next();
            System.out.print("Personel Adres ilçe: ");
            String ilce = scanner.next();

            Personel personel = new Personel(personelNo, isim, new Adres(il, ilce));
            personeller.add(personel);
        }

        for (Personel personel : personeller) {
            System.out.println("Personel No: " + personel.getPersonelNo());
            System.out.println("Personel Ad: " + personel.getIsim());
            System.out.println("Personel Adres il: " + personel.getAdres().getIl());
            System.out.println("Personel Adres ilçe: " + personel.getAdres().getIlce());
        }

    }
}

/*
Personel sınıfı ve adres sınıfı olacak.
Bu sınıfların Personel(Personelno, isim, adres) ve Adres(adres, il, ilçe) şeklinde olacak.
5 personel oluşturulacak ve bu personellerin adresleri olacak.
 */