package com.example.a08kalitim;

public class KalitimMain {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.setKasaTipi("Sedan");
        araba.setRenk("Kırmızı");
        araba.setVitesTipi("Otomatik");

        System.out.println("Araba: " + araba.getRenk() + " " + araba.getKasaTipi() + " " + araba.getVitesTipi());


        Subaru subaru = new Subaru("1.6V");
        subaru.setRenk("Beyaz");
        subaru.setVitesTipi("Manuel");

        System.out.println("Subaru: " + subaru.getRenk() + " " + subaru.getKasaTipi() + " " + subaru.getVitesTipi() + " " + subaru.getMotorHacmi());

    }
}
/*
Kalıtım (Inheritance)
* Bir sınıfın özelliklerini başka bir sınıfa aktarmak için kullanılır.
* Kalıtım, kod tekrarını önlemek için kullanılır.
* Kalıtım, kodun okunabilirliğini arttırmak için kullanılır.
* Subclass (alt sınıf) ve Superclass (üst sınıf) olarak adlandırılır.
* Subclass, Superclass'ın özelliklerini kullanabilir.
* Subclass extends Superclass şeklinde kullanılır.

Kalıtım İlişkisinde Constructor'lar
* Constructor alt sınıfa geçmez.
* Her alt sınıfın ilk görevi, üst sınıfın constructor'ını çağırmaktır. Yani alttan üste doğru constructor'lar çağrılır.
* Üst sınıf constructor'ı çağırmak için : super() kullanılır.
* Mevcut constructor'ı çağırmak için : this() kullanılır.

Method Overriding (Metod Geçersiz Kılma)
* Bir sınıfta bir metodun alt sınıflarda farklı şekilde çalışmasını sağlamak için kullanılır.

 */