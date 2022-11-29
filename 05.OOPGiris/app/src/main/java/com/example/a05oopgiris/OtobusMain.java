package com.example.a05oopgiris;

public class OtobusMain {
    public static void main(String[] args) {
        Otobus kamilKoc = new Otobus();
        kamilKoc.kapasite = 50;
        kamilKoc.mevcutYolcu = 20;
        kamilKoc.nereden = "İstanbul";
        kamilKoc.nereye = "Ankara";

        Otobus nilufer = new Otobus();
        nilufer.kapasite = 40;
        nilufer.mevcutYolcu = 10;
        nilufer.nereden = "Ankara";
        nilufer.nereye = "İzmir";

        kamilKoc.bilgiAl();
        System.out.println("---------------------");
        nilufer.bilgiAl();
        kamilKoc.yolcuAl(20);
        kamilKoc.yolcuIndir(30);
        System.out.println("---------------------");
        kamilKoc.bilgiAl();
    }


}


