package com.example.a07oopileri.siniflar;

public class Urunler {
    private  String urunAdi;
    private  int urunFiyati;

    public Urunler(String urunAdi, int urunFiyati) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
    }

    public Urunler() {
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(int urunFiyati) {
        this.urunFiyati = urunFiyati;
    }
}
