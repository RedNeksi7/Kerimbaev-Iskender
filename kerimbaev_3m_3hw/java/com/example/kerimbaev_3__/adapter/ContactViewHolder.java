package com.example.kerimbaev_3__.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.kerimbaev_3__.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    TextView textViewName;
    ImageView icon;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String name){
        textViewName = itemView.findViewById(R.id.textViewName);
        icon = itemView.findViewById(R.id.imageViewIcon);

        textViewName.setText(name);
    }
}
