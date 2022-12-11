package com.example.a08kalitim;

public class Araba extends Arac{
    private String kasaTipi;

    public Araba(){
        super();
        System.out.println("Araba Boş Constructor'ı Çalıştı");
    }
    public Araba(String kasaTipi) {
        super();
        this.kasaTipi = kasaTipi;
        System.out.println("Araba Dolu Constructor'ı Çalıştı");
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public void bilgileriYazdir(){
        System.out.println("Araba: " + getRenk() + " " + getKasaTipi() + " " + getVitesTipi());
    }
}
