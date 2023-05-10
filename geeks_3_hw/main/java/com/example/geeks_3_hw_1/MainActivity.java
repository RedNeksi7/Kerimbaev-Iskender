package com.example.geeks_3_hw_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText surname;
    EditText age;

    AppCompatButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setClick();
    }


    private void findView() {
        name = findViewById(R.id.edit_text_name);
        surname = findViewById(R.id.edit_text_surname);
        age = findViewById(R.id.edit_text_age);
        button = findViewById(R.id.button);
    }

    private void setClick(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSecond();
            }
        });
    }
    private void navigateToSecond(){
        Intent intent=new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name",name.getText());
        intent.putExtra("surname",surname.getText());
        intent.putExtra("age",age.getText());
        startActivity(intent);
    }


}