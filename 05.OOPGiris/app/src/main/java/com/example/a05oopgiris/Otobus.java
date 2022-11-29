package com.example.a05oopgiris;

public class Otobus{
    int kapasite;
    int mevcutYolcu;
    String nereden;
    String nereye;
    public void bilgiAl(){
        System.out.println("Kapasite: " + kapasite);
        System.out.println("Mevcut Yolcu : " + mevcutYolcu);
        System.out.println("Nereden : " + nereden);
        System.out.println("Nereye : " + nereye);
    }

    public void yolcuAl(int yolcuMiktari){
        mevcutYolcu += yolcuMiktari;
        if(mevcutYolcu > kapasite){
            System.out.println("Yolcu sayısı : " + mevcutYolcu);
        }else{
            System.out.println("Otobüs boş");
        }
    }

    public void yolcuIndir(int yolcuMiktari){
        mevcutYolcu -= yolcuMiktari;
        if(mevcutYolcu == 0){
            System.out.println("Otobüs boş");
        }else {
            System.out.println("Yolcu sayısı : " + mevcutYolcu);

        }
    }
}