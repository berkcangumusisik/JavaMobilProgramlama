package com.example.a05oopgiris;

public class Araba {
    String renk;
    int hiz;
    double uzunluk;
    boolean calisiyorMu;

    public void calistir(){
        calisiyorMu = true;
    }

    public void durdur(){
        calisiyorMu = false;
    }

    public void hizlan(int miktar){
        hiz += miktar;
    }

    public void yavasla(int miktar){
        hiz -= miktar;
    }
}
