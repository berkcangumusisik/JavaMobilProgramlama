package com.example.a08kalitim;

public class CastingMain {
    public static void main(String[] args) {
        Subaru subaru = new Subaru();
        Araba araba = subaru;


        Araba araba2 = new Araba();
        Subaru subaru2 = (Subaru) araba2;
    }
}
