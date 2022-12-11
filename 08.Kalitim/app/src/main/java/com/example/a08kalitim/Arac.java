package com.example.a08kalitim;

public class Arac {
    private String renk;
    private String vitesTipi;

    public Arac() {
        super();
        System.out.println("Araç Boş Constructor'ı Çalıştı");
    }

    public Arac(String renk, String vitesTipi) {
        super();
        this.renk = renk;
        this.vitesTipi = vitesTipi;
        System.out.println("Araç Dolu Constructor'ı Çalıştı");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }
}
