package com.ddona.wallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.ddona.wallpaper.fragment.WallpaperFragment;

public class MainActivity extends AppCompatActivity {
    private WallpaperFragment wallpaperFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wallpaperFragment = new WallpaperFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    }
}
