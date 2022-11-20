package com.example.a01degiskenveveriturleri;

import java.util.Scanner;

public class KonsolGirdisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String ad = scanner.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Boyunuzu giriniz :");
        double boy = scanner.nextDouble();

        System.out.print("Evli misiniz?");
        boolean evli = scanner.nextBoolean();

        System.out.println("Adınız: " + ad);
        System.out.println("Yaşınız: " + yas);
        System.out.println("Boyunuz : "  + boy);
        System.out.println("Evli misiniz? " + evli);

    }
}

/**
 * Scanner sınıfı ile konsoldan girdi almak için kullanılır.
 * nextInt(), nextDouble(), nextLine() gibi metotlar ile girdi alınabilir.
 * nextInt() metodu ile int tipinde girdi alınabilir.
 * nextDouble() metodu ile double tipinde girdi alınabilir.
 * nextLine() metodu ile String tipinde girdi alınabilir.
 * next() metodu ile String tipinde girdi alınabilir.
 * nextBoolean() metodu ile boolean tipinde girdi alınabilir.
 * nextByte() metodu ile byte tipinde girdi alınabilir
 */