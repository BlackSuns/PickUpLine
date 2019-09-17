package com.codebabes.pickupline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Grab clean button so we can do stuff with it!
        final Button dirtyButton = findViewById(R.id.dirtyButton);
        final Button cleanButton = findViewById(R.id.cleanButton);

        cleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, com.codebabes.pickupline.LineActivity.class);
                startActivity(intent);

            }
        });
        dirtyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, com.codebabes.pickupline.Dline.class);
                startActivity(intent);

            }
        });

    }

}
