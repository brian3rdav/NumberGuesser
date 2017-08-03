package com.example.numberguesser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomInteger;

    public void randomNumberGenerator() {

        Random rand = new Random();
        randomInteger = rand.nextInt(21);

    }



    public void guessNumberFunction(View view){
        EditText userNumber = (EditText) findViewById(R.id.userNumber);

        int userNumberInt = Integer.parseInt(userNumber.getText().toString());




        if ( userNumberInt > randomInteger ){
            Toast.makeText(MainActivity.this, "Too high, try again", Toast.LENGTH_SHORT).show();

        }

        else if (userNumberInt < randomInteger) {
            Toast.makeText(MainActivity.this, "Too low, try again", Toast.LENGTH_SHORT).show();

        }

        else {
            Toast.makeText(MainActivity.this, "You got it!", Toast.LENGTH_LONG).show();

            Toast.makeText(MainActivity.this, "New random number generated. Guess again", Toast.LENGTH_SHORT).show();
            randomNumberGenerator();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}
