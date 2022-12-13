package com.example.a09string;

import java.util.Locale;

public class StringMetotlari {
    public static void main(String[] args) {
        String s1 = "Merhaba Ali";
        System.out.println(s1.charAt(2)); // r
        System.out.println(s1.length()); // 12
        System.out.println(s1.substring(2, 5)); // rha
        System.out.println(s1.replace("a", "o")); // Merhobo Ali
        System.out.println(s1.toLowerCase()); // merhaba ali
        System.out.println(s1.toUpperCase()); // MERHABA ALI
        System.out.println(s1.trim()); // Merhaba Ali
        String[] dizi = s1.split(" ");
        for (String s : dizi) {
            System.out.println(s);
        }
    }


}

/*
charAt() metodu => Belirtilen indexdeki karakteri döndürür
concat() metodu => Stringleri birleştirir.
Equals() metodu => Stringleri karşılaştırır.
equalsIgnoreCase() metodu => Stringleri büyük küçük harf duyarlılığı olmadan karşılaştırır.
length() metodu => Stringin uzunluğunu döndürür.
replace() metodu => String içindeki karakterleri değiştirir.
substring() metodu => String içindeki karakterleri keser.
toLowerCase() metodu => Stringi küçük harfe çevirir.
toUpperCase() metodu => Stringi büyük harfe çevirir.
trim() metodu => Stringin başındaki ve sonundaki boşlukları siler.
split() metodu => Stringi belirtilen karaktere göre parçalar.
 */