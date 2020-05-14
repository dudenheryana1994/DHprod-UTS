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

import android.content.Context;
import android.content.SharedPreferences;

public class prefmanager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "introslider";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

        public prefmanager(Context context) {
            this._context = context;
            pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
            editor = pref.edit();
        }

        public void setFirstTimeLaunch(boolean isFirstTime){
            editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
            editor.commit();
        }

        public boolean isFirstTimeLaunch() {
            return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
        }
}
