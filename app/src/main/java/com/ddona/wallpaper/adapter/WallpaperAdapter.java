package com.ddona.wallpaper.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ddona.wallpaper.R;
import com.ddona.wallpaper.model.Wallpaper;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperAdapter.ViewHolder> {
    private List<Wallpaper> arrWallpapers;
    private Context context;

    public WallpaperAdapter(List<Wallpaper> arrWallpapers, Context context) {
        this.arrWallpapers = arrWallpapers;
        this.context = context;
    }

    @NonNull
    @Override
    public WallpaperAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_wallpaper, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WallpaperAdapter.ViewHolder holder, int position) {
        Wallpaper wallpaper = arrWallpapers.get(position);
        holder.imgWallpaper.setImageResource(wallpaper.getImage());
        holder.tvName.setText(wallpaper.getName());
        holder.tvAuthor.setText(wallpaper.getAuthor());
    }

    @Override
    public int getItemCount() {
        return arrWallpapers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgWallpaper;
        TextView tvName, tvAuthor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgWallpaper = itemView.findViewById(R.id.img_wallpaper);
            tvAuthor = itemView.findViewById(R.id.tv_image_author);
            tvName = itemView.findViewById(R.id.tv_image_name);
        }
    }
}
