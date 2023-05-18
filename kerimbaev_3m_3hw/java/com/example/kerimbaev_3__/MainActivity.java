package com.example.kerimbaev_3__;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.kerimbaev_3__.adapter.ContactAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String>arrayListNames=new ArrayList<>();
    ContactAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListNames.add("Kerimbaev");
        arrayListNames.add("Iskender");
        arrayListNames.add("Talantbekovich");

        adapter = new ContactAdapter(arrayListNames);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }
}
