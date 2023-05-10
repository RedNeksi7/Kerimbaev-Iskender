package com.example.geeks_3_hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView name;
    TextView surname;
    TextView age;
    String userName;
    String userSurName;
    String userAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        userInfo();
        findViews();
        setText();
    }
    private void userInfo(){
        userName = getIntent().getStringExtra("name");
        userSurName = getIntent().getStringExtra("surname");
        userAge = getIntent().getStringExtra("age");
    }
    public void findViews(){
        name= findViewById(R.id.text_view_name);
        surname= findViewById(R.id.text_view_surname);
        age= findViewById(R.id.text_view_age);
    }
    private void setText(){
        name.setText(userName);
        surname.setText(userSurName);
        age.setText(userAge);
    }

}