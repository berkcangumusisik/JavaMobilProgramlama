package com.example.a07oopileri.siniflar;

public class Renkler {
    public static final int KIRMIZI = 1111;
    public static final int MAVI = 2222;
    public static final int YESIL = 333;

    public void boya(int renkTerchi){
        if(renkTerchi == 1111){
            System.out.println("Kırmızı boyandı");
        }else if(renkTerchi == 2222){
            System.out.println("Mavi boyandı");
        }else if(renkTerchi == 333){
            System.out.println("Yeşil boyandı");
        }

    }
}

/*
Anahtar Kelime : final
final anahtar kelimesi ile tanımlanan değişkenlerin değeri değiştirilemez.
Math.PI ve Math.E, Math sınıfının final değişkenleridir.
 */