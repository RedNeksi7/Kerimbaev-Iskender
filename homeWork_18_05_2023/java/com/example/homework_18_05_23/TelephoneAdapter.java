package com.example.homework_18_05_23;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TelephoneAdapter extends RecyclerView.Adapter<TelephoneViewHolder> {
    ArrayList<TelephoneModel>adapterArrayList;
    OnItemClick adapterClick;

    public TelephoneAdapter(ArrayList<TelephoneModel>constructorArrayList, OnItemClick onItemClick){
        adapterArrayList=constructorArrayList;
        adapterClick=onItemClick;
    }

    @NonNull
    @Override
    public TelephoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TelephoneViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.telephone_background, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TelephoneViewHolder holder, int position) {
        holder.onBind(adapterArrayList.get(position));
        holder.itemView.setOnClickListener(view -> {
            adapterClick.onItemClick(adapterArrayList.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return adapterArrayList.size();
    }
}
