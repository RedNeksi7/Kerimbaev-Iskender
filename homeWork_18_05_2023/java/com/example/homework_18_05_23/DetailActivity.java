package com.example.homework_18_05_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView detailImage;
    TextView detailTitle;
    TextView detailYear;
    TextView detailMemory;
    TextView detailSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        findId();

        TelephoneModel telephoneModel=(TelephoneModel) getIntent().getSerializableExtra("telephone");
        detailImage.setImageResource(telephoneModel.getImage());
        detailTitle.setText(telephoneModel.getTitle());
        detailYear.setText(telephoneModel.getYear());
        detailMemory.setText(telephoneModel.getMemory());
        detailSum.setText(telephoneModel.getSum());

    }
    public void findId(){
        detailImage.findViewById(R.id.detail_imageView);
        detailTitle.findViewById(R.id.detail_title);
        detailYear.findViewById(R.id.detail_year);
        detailMemory.findViewById(R.id.detail_memory);
        detailSum.findViewById(R.id.detail_sum);
    }
}