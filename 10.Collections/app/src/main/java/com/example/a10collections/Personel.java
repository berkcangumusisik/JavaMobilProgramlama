package com.example.a10collections;

public class Personel {
    private int personelNo;
    private String isim;
    private Adres adres;

    public Personel(int personelNo, String isim, Adres adres) {
        this.personelNo = personelNo;
        this.isim = isim;
        this.adres = adres;
    }

    public Personel() {
    }

    public int getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(int personelNo) {
        this.personelNo = personelNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }


}
