package com.example.a08kalitim;

public class InterfaceMain {
    public static void main(String[] args) {
        Object aslan = new Aslan();
        Elma elma = new Elma();
        AmasyaElmasi amasyaElmasi = new AmasyaElmasi();
        Eatable tavuk = new Tavuk();

        Object[] objects = {aslan, elma, amasyaElmasi, tavuk};
        for (Object object : objects) {
            if (object instanceof Eatable) {
                ((Eatable) object).howToEat();
            }
            if (object instanceof Squuezable) {
                ((Squuezable) object).howToSqueeze();
            }
        }

    }
}
