package com.example.a07oopileri.siniflar;

public class Ogrenciler {
    public String isim;
    public int okulNo;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }



    public void bilgiAl() {
        System.out.println("İsim: " + getIsim());
        System.out.println("Okul No: " + getOkulNo());
    }
}
