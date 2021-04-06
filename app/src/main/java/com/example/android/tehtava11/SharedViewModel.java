package com.example.android.tehtava11;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private MutableLiveData<String> text;

    public void setTextData(String nameData) {
        text.setValue(nameData);
        System.out.println(text.getValue());


    }

    public MutableLiveData<String> getTextData() {
        if (text == null) {
            text = new MutableLiveData<>();
        }

        return text;
    }
}
