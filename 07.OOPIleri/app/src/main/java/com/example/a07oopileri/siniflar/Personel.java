package com.example.a07oopileri.siniflar;

public class Personel {
    private String isim;
    private int yas;
    private static int sayac;

    public Personel(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
        sayac++;
    }

    public Personel() {
        sayac++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public static int getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        Personel.sayac = sayac;
    }
}
