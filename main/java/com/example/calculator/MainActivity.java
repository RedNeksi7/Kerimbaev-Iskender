package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second, result;
    private Boolean isOperation;
    private Boolean isEqualDouble;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView.findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                numberClick("1");
                break;
            case R.id.btn_two:
                numberClick("2");
                break;
            case R.id.btn_clear:
                textView.setText("0");
                break;
            case R.id.btn_three:
                numberClick("3");
                break;
            case R.id.btn_four:
                numberClick("4");
                break;
            case R.id.btn_five:
                numberClick("5");
                break;
            case R.id.btn_six:
                numberClick("6");
                break;
            case R.id.btn_seven:
                numberClick("7");
                break;
            case R.id.btn_eight:
                numberClick("8");
                break;
            case R.id.btn_nine:
                numberClick("9");
                break;
        }
        isOperation=false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                    first= Integer.valueOf(textView.getText().toString());
                    isEqualDouble=false;
                break;

            case R.id.btn_equal:
                if (!isEqualDouble){
                    second=Integer.valueOf(textView.getText().toString());
                }else {
                    first=Integer.valueOf(textView.getText().toString());
                }
                isEqualDouble=true;
                result=first+second;
                textView.setText(result.toString());
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                isEqualDouble=false;
                result=first-second;
                textView.setText(result.toString());
            case R.id.btn_multiplication:
                first=Integer.valueOf(textView.getText().toString());
                isEqualDouble=false;
                result=first*second;
                textView.setText(result.toString());
            case R.id.btn_division:
                first=Integer.valueOf(textView.getText().toString());
                isEqualDouble=false;
                result=first/second;
                textView.setText(result.toString());
        }
        isOperation=true;
    }
    public String numberClick(String num){
        switch (num){
            case "1":
                if (textView.getText().toString().equals("0") || isOperation){
                    textView.setText("1");
                }else{
                    textView.append("1");
                }
                break;
            case "2":
                if (textView.getText().toString().equals("0") || isOperation){
                    textView.setText("2");
                }else{
                    textView.append("2");
                }
                break;
            case "3":
                if (textView.getText().toString().equals("0") || isOperation){
                    textView.setText("3");
                }else{
                    textView.append("3");
                }
            case "4":
                if (textView.getText().toString().equals("0") || isOperation){
                    textView.setText("4");
                }else{
                    textView.append("4");
                }
            case "5":
                if (textView.getText().toString().equals("0") || isOperation){
                    textView.setText("5");
                }else{
                    textView.append("5");
                }
            case "6":
                if (textView.getText().toString().equals("0") || isOperation){
                    textView.setText("6");
                }else{
                    textView.append("6");
                }
            case "7":
                if (textView.getText().toString().equals("0") || isOperation){
                    textView.setText("7");
                }else{
                    textView.append("7");
                }
            case "8":
                if (textView.getText().toString().equals("0") || isOperation){
                    textView.setText("8");
                }else{
                    textView.append("8");
                }
            case "9":
                if (textView.getText().toString().equals("0") || isOperation){
                    textView.setText("9");
                }else{
                    textView.append("9");
                }
        }
        return num;
    }
}