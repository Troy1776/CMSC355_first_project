package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button button1;
    private Button button4;
    private Button button3;
    private Button button2;
    private Button button5;
    boolean inOrder1 = false;
    boolean inOrder2 = false;
    boolean inOrder3 = false;
    boolean inOrder4 = false;
    boolean completion = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity1();
            }
        });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inOrder1 = true;
                inOrder2 = false;
                inOrder3 = false;
                inOrder4 = false;
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inOrder1 == true && inOrder2 == false) {
                    inOrder2 = true;
                    inOrder1 = false;
                } else {
                    inOrder1 = false;
                    inOrder2 = false;
                    inOrder3 = false;
                    inOrder4 = false;
                }
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inOrder2 == true && inOrder3 == false) {
                    inOrder3 = true;
                    inOrder2 = false;
                } else {
                    inOrder1 = false;
                    inOrder2 = false;
                    inOrder3 = false;
                    inOrder4 = false;
                }
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inOrder3 == true && inOrder4 == false) {
                    inOrder4 = true;
                    inOrder3 = false;
                } else {
                    inOrder1 = false;
                    inOrder2 = false;
                    inOrder3 = false;
                    inOrder4 = false;
                }
            }
        });
    }
    public void openActivity1(){
        if(inOrder4 == true){

            setContentView(R.layout.activity_main);

            TextView t = (TextView) findViewById(R.id.mainScreenText);
            t.setText("test");

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("unlock","The App is unlocked");
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

}
