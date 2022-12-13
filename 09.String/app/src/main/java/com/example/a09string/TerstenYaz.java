package com.example.a09string;

import java.util.Scanner;

public class TerstenYaz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        String tersKelime = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }
        System.out.println(tersKelime);
    }
}
