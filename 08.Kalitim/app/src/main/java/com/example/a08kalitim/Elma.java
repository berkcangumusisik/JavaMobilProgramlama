package com.example.a08kalitim;

public class Elma implements Eatable,Squuezable{
    @Override
    public void howToEat() {
        System.out.println("Yıka ve ye");
    }

    @Override
    public void howToSqueeze() {
        System.out.println("Soy ve suyunu çıkar");
    }
}

