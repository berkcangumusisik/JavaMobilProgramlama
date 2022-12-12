package com.example.a08kalitim;

public class Mudur extends Personel{
    public void iseAl(Personel p) {
        p.iseAlindi();
    }

    public void terfiEttir(Personel p){
        ((Ogretmen)p).maasArttir();
    }
}
