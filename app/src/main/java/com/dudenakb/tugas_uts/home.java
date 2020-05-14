package com.dudenakb.tugas_uts;

// Tanggal Pengerjaaan : 07 Mei 2020
// Deskripsi Pengerjaan :Membuat Splash Screen dan Walkthrough
// NIM : 10117137
// Nama : Duden Heryana
// Kelas : IF-4

//Tanggal Pengerjaaan : 15 Mei 2020
//Deskripsi Pengerjaan : Membuat Menu
//NIM : 10117137
//Nama : Duden Heryana
//Kelas : IF-4


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // kita set default nya Home Fragment
        loadFragment(new HomeFragment());
        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomnav = findViewById(R.id.menu_bottom_navigasi);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomnav.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment){
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment Fragment = null;
        switch (menuItem.getItemId()){
            case R.id.home_menu:
                Fragment = new HomeFragment();
                break;
            case R.id.activiti_menu:
                Fragment = new ActivityFragment();
                break;
            case R.id.gallery_menu:
                Fragment = new GelleryFragment();
                break;
            case R.id.music_menu:
                Fragment = new MusicFragment();
                break;
            case R.id.profile_menu:
                Fragment = new ProfileFragment();
                break;
        }
        return loadFragment(Fragment);
    };
}
