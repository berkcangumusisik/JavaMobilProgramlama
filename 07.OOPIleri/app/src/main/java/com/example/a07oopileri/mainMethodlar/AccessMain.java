package com.example.a07oopileri.mainMethodlar;

import com.example.a07oopileri.siniflar.Ogrenciler;
import com.example.a07oopileri.siniflar.Urunler;

public class AccessMain {
    public static void main(String[] args) {
        Ogrenciler ogrenci = new Ogrenciler();
        ogrenci.setIsim("Ahmet");
        ogrenci.setOkulNo(123);
        ogrenci.bilgiAl();


        Urunler urun = new Urunler("Telefon", 5000);
        System.out.println("Ürün Adı: " + urun.getUrunAdi());
        System.out.println("Ürün Fiyatı: " + urun.getUrunFiyati());
    }
}

/*
public > protected > private
Erişim belirleyicileri sırası yukarıdaki gibidir. Yani public olan her yerden erişilebilir, protected olan sadece kendi paketinde ve alt paketlerde erişilebilir, private olan ise sadece kendi sınıfında erişilebilir.
Erişim sınıfa, metoda ve sınıf değişkenlerine olan erişimleri belirler.
varsayılan değer protected
 */