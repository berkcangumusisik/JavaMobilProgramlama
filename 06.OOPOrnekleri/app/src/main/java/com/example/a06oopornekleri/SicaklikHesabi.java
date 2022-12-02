package com.example.a06oopornekleri;

import java.util.Scanner;

public class SicaklikHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        double sicaklik = scanner.nextDouble();

        SicaklikHesabi sicaklikHesabi = new SicaklikHesabi();
        sicaklikHesabi.sicaklikDonustur(sicaklik);
    }

    public void sicaklikDonustur(double sicaklik){
        double f = (sicaklik * 1.8) + 32;
        System.out.println("Fahrenheit: " + f);
    }
}
/*
Sıcaklık değerini Celsius cinsinden alın ve aşağıdaki formüle göre sıcaklık değerini Fahrenheit cinsinden hesaplayıp ekrana yazdırın.
 */