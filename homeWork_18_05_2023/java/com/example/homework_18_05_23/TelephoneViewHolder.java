package com.example.homework_18_05_23;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TelephoneViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name;
    TextView title;
    TextView year;
    TextView memory;
    TextView sum;

    public TelephoneViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void onBind(TelephoneModel telephoneModel){
        findId();

        image.setImageResource(telephoneModel.getImage());
        name.setText(telephoneModel.getName());
        title.setText(telephoneModel.getTitle());
        year.setText(telephoneModel.getYear());
        memory.setText(telephoneModel.getMemory());
        sum.setText(telephoneModel.getSum());
    }
    public void findId(){
        image=itemView.findViewById(R.id.imageView);
        name=itemView.findViewById(R.id.textView_name);
        title=itemView.findViewById(R.id.textView_title);
        year=itemView.findViewById(R.id.textView_year);
        memory=itemView.findViewById(R.id.textView_memory);
        sum=itemView.findViewById(R.id.textView_sum);
    }
}
