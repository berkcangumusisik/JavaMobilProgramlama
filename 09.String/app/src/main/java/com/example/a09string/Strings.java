package com.example.a09string;

public class Strings {
    public static void main(String[] args) {
        String s1 = "Merhaba Dünya";
        String s2 = s1;
        String s3 = "Merhaba Dünya";
        String s4 = "Merhaba ";
        String s5 = s4 + "Düny";

        String s6 = new String("Merhaba Dünya");

        if (s1 == s6) {
            System.out.println("Eşit");
        } else {
            System.out.println("Eşit değil");
        }

        String s7 = "Merhaba";
        String s8 = "MERHABA";
        if (s7.equals(s8)) {
            System.out.println("Eşit");
        } else {
            System.out.println("Eşit değil");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Merhaba");
        sb.append(" ");
        sb.append("Dünya");
        System.out.println(sb.toString());
    }
}
// StringBuilder => String nesnesi gibi davranır. Fakat String nesnesi gibi davranırken bellekte yeni bir nesne oluşturmaz.