package com.example.kerimbaev_hw_2__;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class userNameFragment extends Fragment {
    MaterialButton materialButton;
    EditText nameEdit;
    EditText secondNameEdit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user_name, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        materialButton.findViewById(R.id.button_save_info);
        nameEdit.findViewById(R.id.userName_editText);
        secondNameEdit.findViewById(R.id.userSecondName);
        materialButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("name", nameEdit.getText().toString());
                bundle.putString("secondName", secondNameEdit.getText().toString());
                userInfoFragment userInfoFragment = new userInfoFragment();
                userInfoFragment.setArguments(bundle);

                requireActivity().
                        getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.fragment_container, new userPhysicalFragment()).addToBackStack(null).commit();
            }
        });
    }
}