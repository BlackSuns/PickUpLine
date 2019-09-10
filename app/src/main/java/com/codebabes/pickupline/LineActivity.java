package com.codebabes.pickupline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
