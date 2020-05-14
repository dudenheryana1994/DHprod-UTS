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

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}
