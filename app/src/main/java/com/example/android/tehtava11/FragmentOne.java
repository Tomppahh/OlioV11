package com.example.android.tehtava11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;


import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.switchmaterial.SwitchMaterial;


public class FragmentOne extends Fragment {

    private SharedViewModel sharedViewModel;
    private SwitchCompat kytkin;
    public FragmentOne(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View root = inflater.inflate(R.layout.fragment_two, container, false);



        sharedViewModel = ViewModelProviders.of(requireActivity()).get(SharedViewModel.class);

        kytkin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sharedViewModel.getTextData().getValue() == "true") {
                    sharedViewModel.setTextData("False");
                }
                else {
                    sharedViewModel.setTextData("True");
                }
            }
        });


        return root;
    }
}


// KYTKINFRAGMENT, LÄHETTÄVÄ FRAGMENT