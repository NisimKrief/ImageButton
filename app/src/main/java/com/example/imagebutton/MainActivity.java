package com.example.imagebutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int random;
    ImageView iv;
    ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.imageButton);
        iv = findViewById(R.id.imageView);

    }
    public void go(View view){
        random = rand.nextInt(3) + 1;
        iv.setVisibility(View.VISIBLE);
        if (random == 1) {
            iv.setImageResource(R.drawable.leopard);
            btn.setImageResource(R.drawable.one);
        }
        else if(random ==2){
            iv.setImageResource(R.drawable.kaleb);
            btn.setImageResource(R.drawable.two);
        }
        else{
            iv.setImageResource(R.drawable.sos);
            btn.setImageResource(R.drawable.three);
        }

    }

}

