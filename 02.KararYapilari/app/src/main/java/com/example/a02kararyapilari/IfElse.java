package com.example.a02kararyapilari;

public class IfElse {
    public static void main(String[] args) {
        int yas = 23;
        String isim = "Berkcan";
        if (yas > 18) {
            System.out.println(isim + " reşitsiniz");
        } else {
            System.out.println(isim + " reşit değilsiniz");
        }

        if(isim.equals("Berkcan")){
            System.out.println("İsim Berkcan");
        }else if (isim.equals("Ahmet")) {
            System.out.println("İsim Ahmet");
        }else{
            System.out.println("İsim kimse");
        }

        int sifre = 1234;
        String kullaniciAdi = "admin";
        if (sifre == 1234 && kullaniciAdi.equals("admin")) {
            System.out.println("Giriş başarılı");
        }else{
            System.out.println("Giriş başarısız");
        }
    }
}
/**
 if-else yapısı
    if-else yapısı, bir koşulun doğru olup olmadığını kontrol eder.
 if(koşul){
    // Koşul doğruysa çalışacak kodlar
 }else if(koşul){
    // Koşul doğruysa çalışacak kodlar
 }else{
    // Koşullar yanlışsa çalışacak kodlar
 }

 */