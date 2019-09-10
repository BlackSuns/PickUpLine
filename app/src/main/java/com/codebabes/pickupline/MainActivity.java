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
        Button cleanButton = findViewById(R.id.cleanButton);
        final Button dirtyButton = findViewById(R.id.dirtyButton);

        final String pickupLine = "Can I emulate that hello world!";

        cleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sendLine(pickupLine);
            }
        });

    }

    private void sendLine(/*String pickupLine*/){
        Intent intent = new Intent(this, LineActivity.class);
        //Intent.putExtra("Pickup Line", pickupLine);
        startActivity(intent);
    }

}
