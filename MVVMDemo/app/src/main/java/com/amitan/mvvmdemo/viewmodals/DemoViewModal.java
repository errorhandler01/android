package com.amitan.mvvmdemo.viewmodals;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.amitan.mvvmdemo.repository.DemoRepository;

public class DemoViewModal extends ViewModel {
    private MutableLiveData<String> demoString;

    public void init(){
        if(demoString != null)
            return;
        DemoRepository demoRepository = new DemoRepository();
        demoString = demoRepository.getString();
    }

    public LiveData<String> getDemoString(){
        return demoString;
    }
}
