package com.example.a07oopileri.siniflar;

public class Kisiler {
    private String isim;
    private int tel;
    private Adresler adresler;

    public Kisiler(String isim, int tel, Adresler adresler) {
        this.isim = isim;
        this.tel = tel;
        this.adresler = adresler;
    }

    public Kisiler(){

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Adresler getAdresler() {
        return adresler;
    }

    public void setAdresler(Adresler adresler) {
        this.adresler = adresler;
    }
}
