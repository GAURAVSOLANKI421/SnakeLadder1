package com.example.user.snakeladder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[]mydice={R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void rollTapped(View view){
        Random ran =new Random();
        int randomnumber=ran.nextInt(6);
        ImageView dc=(ImageView) findViewById(R.id.dice);
        dc.setImageResource(mydice[randomnumber]);
    }
}
