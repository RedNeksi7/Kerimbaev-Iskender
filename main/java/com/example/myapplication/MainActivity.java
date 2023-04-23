package com.example.myapplication;

import static android.R.color.darker_gray;
import static android.R.color.holo_green_dark;
import static android.R.color.holo_red_dark;
import static android.R.color.white;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_join= findViewById(R.id.bt);
        EditText pass = findViewById(R.id.pass);
        EditText email = findViewById(R.id.email);
        TextView try1 = findViewById(R.id.tv_welcome_try);
        TextView try2 = findViewById(R.id.tv_welcome_try_1);
        TextView tv_ent = findViewById(R.id.tv_entrance);

        pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                bt_join.setBackgroundColor(getColor(darker_gray));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                bt_join.setBackgroundColor(getColor(holo_red_dark));
            }

            @Override
            public void afterTextChanged(Editable editable) {
                bt_join.setBackgroundColor(getColor(holo_red_dark));
            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                bt_join.setBackgroundColor(getColor(darker_gray));
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                bt_join.setBackgroundColor(getColor(holo_red_dark));
            }

            @Override
            public void afterTextChanged(Editable editable) {
                bt_join.setBackgroundColor(getColor(holo_red_dark));
            }
        });
        bt_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pass.getText().toString() == "admin" && email.getText().toString() == "admin"){
                    Toast toast = Toast.makeText(getApplicationContext(), "Вы успешно зарегистрировались.", Toast.LENGTH_SHORT);
                    pass.setVisibility(View.INVISIBLE);
                    email.setVisibility(View.INVISIBLE);
                    try1.setVisibility(View.INVISIBLE);
                    try2.setVisibility(View.INVISIBLE);
                    tv_ent.setVisibility(View.INVISIBLE);

                }else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Неправильный логин и пароль.", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}