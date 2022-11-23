package com.example.a02kararyapilari;

import java.util.Scanner;

public class ToolBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1) - Sil");
        System.out.println("(2) - Düzenle");
        System.out.println("(3) - Yedekle");

        System.out.print("Seçiminiz: ");
        int secim = scanner.nextInt();
        switch (secim){
            case 1:
                System.out.println("Silme işlemi yapılıyor...");
                break;
            case 2:
                System.out.println("Düzenleme işlemi yapılıyor...");
                break;
            case 3:
                System.out.println("Yedekleme işlemi yapılıyor...");
                break;
            default:
                System.out.println("Geçersiz işlem");
        }
    }
}
