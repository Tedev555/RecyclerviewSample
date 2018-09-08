package me.thanongsine.recyclerviewsample;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<Integer> imgResList;

    RecyclerViewAdapter(List<Integer> imgResList) {
        this.imgResList = imgResList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_item, parent, false);

        return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Integer imgRes = imgResList.get(position);
        ImageView imageView = holder.imageView;
        imageView.setImageResource(imgRes);
    }

    @Override
    public int getItemCount() {
        return imgResList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_view);
        }
    }
}
