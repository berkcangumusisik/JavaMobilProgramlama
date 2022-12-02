package com.example.a06oopornekleri;

import java.util.Scanner;

public class InternetHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İnternet kullanım miktarınızı giriniz: ");
        int internetKullanimMiktari = scanner.nextInt();
        InternetHesaplama internetHesaplama = new InternetHesaplama();
        internetHesaplama.internetHesapla(internetKullanimMiktari);
    }
    public void  internetHesapla(int internetKullanimMiktari){
        int fazlaGb = internetKullanimMiktari - 50;
        int fatura = 100 + (fazlaGb * 4);
        System.out.println("Fatura: " + fatura);

    }
}

/*
Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız.
• 50GB 100 TL
•Kota aşımından sonra her 1GB 4TL

 */