package com.example.homework_18_05_23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick{

    ArrayList<TelephoneModel> arrayListNames=new ArrayList<>();

    TelephoneAdapter telephoneAdapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telephoneAdapter=new TelephoneAdapter(arrayListNames, this);
        recyclerView.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(telephoneAdapter);

        arrayListNames.add(new TelephoneModel(R.drawable.tel_one, "Iphone 11", "PRO MAX", "2020", "128GB", "48000 СОМ"));
        arrayListNames.add(new TelephoneModel(R.drawable.tel_two, "SAMSUNG S20", "GALAXY", "2018", "256GB", "240000 COM"));
    }

    @Override
    public void onItemClick(TelephoneModel telephoneModel) {
        Intent intent=new Intent(this, DetailActivity.class);
        intent.putExtra("telephone", telephoneModel);
        startActivity(intent);
    }
}