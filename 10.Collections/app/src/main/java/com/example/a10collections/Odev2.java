package com.example.a10collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayşe");
        isimler.add("Fatma");
        isimler.add("Ahmet");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak ismi giriniz: ");
        String arananIsim = scanner.next();
        for (String isim : isimler) {
            if (isim.equals(arananIsim)){
                System.out.println("Aranan isim listede mevcut.");
                break;
            }
        }
    }
}

/*
Beş tane isimden oluşan bir arraylist oluşturulacak. Konsoldan girdiğimiz isim bu listede var mı yok mu şeklinde arama yapılacak.
 */