package com.firtstprojectsuvojitsarker.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvcount;
    Button addbutton , subtractButton , restartButton;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvcount = findViewById(R.id.tvCount);
        addbutton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        restartButton = findViewById(R.id.restartButton);

        //click event => button1 / add button
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tvcount.setText(""+count);

            }
        });
        //click event => button2 / subtract button
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tvcount.setText(""+count);
            }
        });
        //click event => button3 / restart button
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                tvcount.setText(""+count);

            }
        });
    }
}