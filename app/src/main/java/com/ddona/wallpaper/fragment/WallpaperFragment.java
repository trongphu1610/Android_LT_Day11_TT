package com.ddona.wallpaper.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ddona.wallpaper.R;
import com.ddona.wallpaper.adapter.WallpaperAdapter;
import com.ddona.wallpaper.model.Wallpaper;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class WallpaperFragment extends Fragment {
    private RecyclerView rvWallpaper;
    private WallpaperAdapter adapter;
    private List<Wallpaper> arrWallpapers;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = LayoutInflater.from(getContext()).inflate(R.layout.fragment_wallpaper, container, false);
        rvWallpaper = view.findViewById(R.id.rc_wallpaper);
        arrWallpapers = new ArrayList<>();
        arrWallpapers.add(new Wallpaper(R.drawable.january, "January", "Đoan"));
        arrWallpapers.add(new Wallpaper(R.drawable.january, "January", "Đoan"));
        arrWallpapers.add(new Wallpaper(R.drawable.january, "January", "Đoan"));
        arrWallpapers.add(new Wallpaper(R.drawable.january, "January", "Đeffffffffffffoan"));
        arrWallpapers.add(new Wallpaper(R.drawable.january, "January", "Đoan"));
        arrWallpapers.add(new Wallpaper(R.drawable.january, "January", "Đoan"));
        arrWallpapers.add(new Wallpaper(R.drawable.january, "January", "Đoan"));
        arrWallpapers.add(new Wallpaper(R.drawable.january, "January", "Đoan"));
        arrWallpapers.add(new Wallpaper(R.drawable.january, "January", "Đoan"));
        adapter =  new WallpaperAdapter(arrWallpapers, getContext());
        rvWallpaper.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rvWallpaper.setAdapter(adapter);
        return view;
    }
}
