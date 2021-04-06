package com.example.android.tehtava11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


public class FragmentTwo extends Fragment {

    private SharedViewModel sharedViewModel;

    public FragmentTwo(){

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        View root = inflater.inflate(R.layout.fragment_two, container, false);


        sharedViewModel = ViewModelProviders.of(requireActivity()).get(SharedViewModel.class);
        EditText kirjoitettava = root.findViewById(R.id.Kirjoitettava);
        TextView luettava = root.findViewById(R.id.Luettava);

        Observer<String> nameObserver = new Observer<String>() {

            @Override
            public void onChanged(String name) {

                if(name == "true") {
                   // kirjoitettava.setEnabled(true);

                    System.out.println("True tulee");
                }
                else{
                  //  kirjoitettava.setEnabled(false);
                }
            }
        };
        sharedViewModel.getTextData().observe(getViewLifecycleOwner(), nameObserver);
        return root;
    }
}


// VASTAANOTTAVA FRAGMENT!