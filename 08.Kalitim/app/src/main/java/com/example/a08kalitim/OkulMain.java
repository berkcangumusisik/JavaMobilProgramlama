package com.example.a08kalitim;

public class OkulMain {
    public static void main(String[] args) {
        Mudur mudur = new Mudur();
        Personel ogretmen = new Ogretmen();
        Personel isci = new Isci();

        mudur.iseAl(ogretmen);
        mudur.iseAl(isci);

        mudur.terfiEttir(ogretmen);
    }
}

/*
equals() => Gerçek nesnenin değerlerini karşılaştırır.
toString() => Nesneyi stringe çevirir.
 */