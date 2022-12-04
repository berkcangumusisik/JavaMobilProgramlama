package com.example.a07oopileri.siniflar;

public class Adresler {
    private String il;
    private String ilce;

    public Adresler(String il, String ilce) {
        this.il = il;
        this.ilce = ilce;
    }

    public Adresler(){

    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }
}
