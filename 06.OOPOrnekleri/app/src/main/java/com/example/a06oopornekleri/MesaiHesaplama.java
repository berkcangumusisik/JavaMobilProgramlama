package com.example.a06oopornekleri;

import java.util.Scanner;

public class MesaiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çalışma gün sayınızı giriniz: ");
        int calismaGunu = scanner.nextInt();

        MesaiHesaplama mesaiHesaplama = new MesaiHesaplama();
        mesaiHesaplama.mesaiHesapla(calismaGunu);

    }

    public void mesaiHesapla(int calismaGunu){
        int calismaSuresi = calismaGunu * 8;
        int mesaiSuresi = calismaSuresi - 160;
        int mesaiUcreti = mesaiSuresi * 10;
        int maas = 1750 + mesaiUcreti;
        System.out.println("Maaş: " + maas);
    }
}

/*
Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri geri döndüren metod yazınız.
1 Günde 8 saat çalışılabilir.
Çalışma saat ücreti : 10 tl
Mesai saat ücreti : 20tl
 160 saat üzeri mesai sayılır
 */