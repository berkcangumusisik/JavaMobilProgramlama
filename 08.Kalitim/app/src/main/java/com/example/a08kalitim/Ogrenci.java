package com.example.a08kalitim;

import java.util.Objects;

public class Ogrenci {
    private int ogrenciNo;
    private String isim;

    public Ogrenci(){

    }
    public Ogrenci(int ogrenciNo, String isim) {
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public boolean equals(Object o) {
        if(ogrenciNo == ((Ogrenci)o).ogrenciNo){
            return true;
        }else {
            return false;
        }
    }


}
