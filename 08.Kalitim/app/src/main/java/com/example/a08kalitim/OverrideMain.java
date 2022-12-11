package com.example.a08kalitim;

public class OverrideMain {
    public static void main(String[] args) {
        Kopek kopek = new Kopek();
        Kedi kedi = new Kedi();
        Hayvan hayvan = new Hayvan();
        Memeliler memeli = new Memeliler();

        kopek.sesCikar();
        kedi.sesCikar();
        hayvan.sesCikar();
        memeli.sesCikar();
    }
}
