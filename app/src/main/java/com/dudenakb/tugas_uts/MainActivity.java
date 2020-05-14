package com.dudenakb.tugas_uts;

// Tanggal Pengerjaaan : 07 Mei 2020
// Deskripsi Pengerjaan :Membuat Splash Screen dan Walkthrough
// NIM : 10117137
// Nama : Duden Heryana
// Kelas : IF-4

// Tanggal Pengerjaaan : 15 Mei 2020
// Deskripsi Pengerjaan : Membuat Menu
// NIM : 10117137
// Nama : Duden Heryana
// Kelas : IF-4

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent intro1=new Intent(MainActivity.this, intro.class);
                startActivity(intro1);
                finish();
            }
        },waktu_loading);


    };
}




