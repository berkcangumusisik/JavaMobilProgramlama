package com.example.a12tasarim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/*
Layout
* Layout, uygulamanızın görünümünü oluşturmak için kullanılan bir bileşendir.
wrap_content: içeriğin boyutuna göre genişliği ayarlar.
match_parent: parent'ın genişliğine göre genişliği ayarlar.
width: genişlik
height: yükseklik
gravity: içeriğin konumunu ayarlar.
padding: içeriğin kenarlarına boşluk bırakır.
margin: kenar boşlukları

LinearLayout
* Dikey veya yatay olarak elemanları birbiri ardına sıralar.
* horizontal: yatay
* vertical: dikey


 */