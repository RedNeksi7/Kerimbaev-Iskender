package com.example.kerimbaev_hw_2__;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class userPhysicalFragment extends Fragment {
    EditText userAge;
    EditText userGender;
    MaterialButton materialButtonPhysical;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user_physical, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        materialButtonPhysical.findViewById(R.id.user_physical_button);
        userAge.findViewById(R.id.age);
        userGender.findViewById(R.id.gender);

        materialButtonPhysical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("age", Integer.parseInt(userAge.getText().toString()));
                bundle.putString("gender", userGender.getText().toString());
                userInfoFragment userInfoFragment= new userInfoFragment();
                userInfoFragment.setArguments(bundle);

                requireActivity().
                        getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.fragment_container, new userStudyWorkFragment()).commit();
            }
        });
    }
}