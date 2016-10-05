package com.example.myandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.MySampleClass;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

    }

    public void  fun(View v){
        String str = new MySampleClass().whatsYourName();
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
