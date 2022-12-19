package com.example.a11projedizini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Mesaj","Uygulama başladı");
    }
}

/*
AndroidManifest.xml => Android uygulamasının çalışabilmesi için gerekli izinleri ve özellikleri tanımladığımız dosya.
res(Resource) Klasörü =>
* Uygulamamızın içindeki resim, ses, video, xml dosyaları vb. dosyaların bulunduğu klasör.
* Activi'ler içerisinden bu kaynaklara erişmek için R sınıfı kullanılır. R resourceları temsil eder.
Layout Klasörü => Uygulamamızın görünümünü oluşturduğumuz dosyaların bulunur.
Drawable Klasörü => Uygulamamızın içinde kullanacağımız resimlerin bulunur.
Values Klasörü =>
* Uygulamamızın içinde kullanacağımız sabit değerlerin bulunduğu klasör.
* Colors.xml => Uygulamamızın içinde kullanacağımız renkleri tanımladığımız dosya.
* Strings.xml => Uygulamamızın içinde kullanacağımız metinleri tanımladığımız dosya.
* Styles.xml => Uygulamamızın içinde kullanacağımız stil tanımlamalarını yaptığımız dosya.
* Dimens.xml => Uygulamamızın içinde kullanacağımız boyutları tanımladığımız dosya.
build.gradle(Module:app) => Uygulamamızın içinde kullanacağımız kütüphaneleri ve sürümlerini tanımladığımız dosya.


Android Monitor
- Logcat
* Uygulamamızın içindeki hataları ve uyarıları gösterir.
* Log.d("TAG", "Mesaj") => Hata ayıklama için kullanılır.
* Log.e("TAG", "Mesaj") => Hata mesajı için kullanılır.
* Log.w("TAG", "Mesaj") => Uyarı mesajı için kullanılır.
* Log.i("TAG", "Mesaj") => Bilgi mesajı için kullanılır.
* Log.v("TAG", "Mesaj") => Veri mesajı için kullanılır.



 */