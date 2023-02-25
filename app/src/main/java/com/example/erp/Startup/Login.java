package com.example.erp.Startup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import com.example.erp.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        getWindow().setStatusBarColor(getResources().getColor(R.color.blue));
    }
}