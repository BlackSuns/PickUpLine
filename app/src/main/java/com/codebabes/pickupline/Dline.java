package com.codebabes.pickupline;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dline);
        final Button button = findViewById(R.id.db);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dline.this.finish();
            }
        });
    }
}
