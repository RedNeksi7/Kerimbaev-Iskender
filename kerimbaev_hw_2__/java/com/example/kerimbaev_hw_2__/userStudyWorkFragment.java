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

public class userStudyWorkFragment extends Fragment {
    MaterialButton studyWorkButton;
    EditText userStudy;
    EditText userJob;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user_study_work, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        studyWorkButton.findViewById(R.id.studyWork_button);
        userStudy.findViewById(R.id.study);
        userJob.findViewById(R.id.job);

        studyWorkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle= new Bundle();
                bundle.putString("study", userStudy.getText().toString());
                bundle.putString("job", userJob.getText().toString());
                userInfoFragment userInfoFragment= new userInfoFragment();
                userInfoFragment.setArguments(bundle);

                requireActivity().
                        getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.fragment_container, new userInfoFragment()).commit();
            }
        });
    }
}