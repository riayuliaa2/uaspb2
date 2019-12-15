package com.example.uaspb2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class aboutus extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
    }

    public void MainActivity(View view) {
        Intent intent = new Intent(aboutus.this, MainActivity.class);
        startActivity(intent);
    }

}
