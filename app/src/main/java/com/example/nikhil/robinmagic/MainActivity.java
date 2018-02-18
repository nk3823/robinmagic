package com.example.nikhil.robinmagic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     final ImageView  ballDisplay = (ImageView)findViewById(R.id.ballDisplay);
        final int[] ballArray= {R.drawable.ball13x,R.drawable.ball23x,R.drawable.ball33x,R.drawable.ball43x,R.drawable.ball53x};
        Button askButton;
        askButton = (Button)findViewById(R.id.askButton);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator= new Random();


                int number = randomNumberGenerator.nextInt(5);
             ballDisplay.setImageResource(ballArray[number]);
            }
        });

    }


}



