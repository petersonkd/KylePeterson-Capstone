package com.example.kyle.qookbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.kyle.qookbook.recipes.ChickenNuggets;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button= (Button) findViewById(R.id.buttor);
        Button button2=(Button) findViewById(R.id.buttor1);
        Button button3=(Button) findViewById(R.id.buttov);
        Button button4=(Button) findViewById(R.id.buttoveg);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Info.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RecipeList.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,VeggRecipList.class));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,VeganRecipList.class));
            }
        });
    }


}
