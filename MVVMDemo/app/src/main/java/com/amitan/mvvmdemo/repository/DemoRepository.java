package com.amitan.mvvmdemo.repository;

import androidx.lifecycle.MutableLiveData;

public class DemoRepository {
    private MutableLiveData<String> demoString = new MutableLiveData<>();

    public MutableLiveData<String> getString(){
        setString();
        MutableLiveData<String> updatedString = demoString;
        return updatedString;
    }

    private void setString(){
        demoString.postValue("updated String");
    }
}
