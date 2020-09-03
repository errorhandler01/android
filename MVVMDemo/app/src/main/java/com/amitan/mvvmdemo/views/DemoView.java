package com.amitan.mvvmdemo.views;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.amitan.mvvmdemo.R;
import com.amitan.mvvmdemo.viewmodals.DemoViewModal;

public class DemoView extends AppCompatActivity {
    private TextView tvDemoText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvvm_view);

        tvDemoText = findViewById(R.id.tvDemoText);

        DemoViewModal demoViewModal = ViewModelProviders.of(this).get(DemoViewModal.class);
        demoViewModal.init();

        demoViewModal.getDemoString().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String demoString) {
                tvDemoText.setText(demoString);
            }
        });
    }
}
