package com.example.pw2_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Groups> groupList;

    public RecyclerAdapter(Context context, ArrayList<Groups> groupList) {
        this.context = context;
        this.groupList = groupList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Groups group = groupList.get(position);
        holder.groupNameTV.setText(group.getGroupName());
        holder.imageView.setImageResource(group.getImageResId());

        holder.itemView.setOnClickListener(v -> {
            showNotification(group.getGroupName(), group.getDescription());
        });
    }

    private void showNotification(String title, String message) {
        Toast.makeText(context, title + ": " + message, Toast.LENGTH_SHORT).show();
    }


    @Override
    public int getItemCount() {
        return groupList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView groupNameTV;
        ImageView imageView;

        ViewHolder(View view) {
            super(view);
            groupNameTV = view.findViewById(R.id.group_name);
            imageView = view.findViewById(R.id.image_view);
        }
    }
}