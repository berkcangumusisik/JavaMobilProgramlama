package com.example.a05oopgiris;

public class Islemler {
    public static void main(String[] args) {
        Islemler i = new Islemler();
        double sonuc = i.average(4.56,3.70,60,98.5,7);
        System.out.println(sonuc);
    }
    public double average(double... numbers){
        double total = 0;
        for (double d : numbers ){
            total += d;
        }
        return total / numbers.length;
    }
}
/**
 * ... birden fazla parametre kullanmayı sağlar.
 */