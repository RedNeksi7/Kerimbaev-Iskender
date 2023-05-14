package com.example.kerimbaev_hw_2__;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class userInfoFragment extends Fragment {
    TextView name;
    TextView secondName;
    TextView study;
    TextView gender;
    TextView job;
    TextView age;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user_physical, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        name.findViewById(R.id.userInfoName);
        study.findViewById(R.id.study);
        age.findViewById(R.id.userInfoAge);
        job.findViewById(R.id.job);
        gender.findViewById(R.id.userInfoGender);
        secondName.findViewById(R.id.userInfoSecondName);
        dataCheking();
    }

    public void dataCheking(){
        if (getArguments().getString("name").length() >3 && getArguments().getString("secondName").length() > 3){
            name.setText(getArguments().getString("name"));
            secondName.setText(getArguments().getString("secondName"));
        }else {
            Toast.makeText(getContext(), "Имя и фамилия должны быть длиннее 3 букв.", Toast.LENGTH_SHORT);
        }

        if (getArguments().getString("gender") == "Мужской" || getArguments().getString("gender") == "Женский"){
            gender.setText(getArguments().getString("gender"));
        }else {
            Toast.makeText(getContext(), "Выбирайте между Мужской и Женский", Toast.LENGTH_SHORT);
        }

        if (getArguments().getString("age") !=null){
            age.setText(getArguments().getString("age"));
        } else {
            Toast.makeText(getContext(), "Ошибка. Возраст должен быть больше нуля.", Toast.LENGTH_SHORT);
        }

        if (getArguments().getString("study") !=null&&getArguments().getString("job")!=null){
            study.setText(getArguments().getString("study"));
            job.setText(getArguments().getString("job"));
        }else{
            Toast.makeText(getContext(), "Неправильно ввели место учебы или работы.", Toast.LENGTH_SHORT);
        }
    }
}