package com.example.mythirdappli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttn1,buttn2,buttn3,buttn4,buttn5,buttn6,buttn7,buttn8,buttn9;
    boolean pla1=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
         buttn1= findViewById(R.id.button0);
         buttn2= findViewById(R.id.button1);
         buttn3= findViewById(R.id.button2);
         buttn4= findViewById(R.id.button3);
         buttn5= findViewById(R.id.button4);
         buttn6= findViewById(R.id.button5);
         buttn7= findViewById(R.id.button6);
         buttn8= findViewById(R.id.button7);
         buttn9= findViewById(R.id.button8);
        checkp();

        buttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pla1)
                {buttn1.setText("X");
                    pla1=false;}
                else
                {buttn1.setText("0");
                    pla1=true;
                }
                buttn1.setEnabled(false);
                endGame();}
        });
        buttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pla1){
                    buttn2.setText("X");
                    pla1=false;}
                else{
                    buttn2.setText("0");
                    pla1=true;
                }
                buttn2.setEnabled(false);
                endGame();
            }
        });
        buttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pla1) {
                    buttn3.setText("X");
                    pla1=false;
                }
                else{
                    buttn3.setText("0");
                    pla1=true;
                }
                buttn3.setEnabled(false);
                endGame();}
        });
        buttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pla1)
                { buttn4.setText("X");
                    pla1=false;}
                else {
                    buttn4.setText("0");
                    pla1=true;}
                buttn4.setEnabled(false);
                endGame();
            }
        });
        buttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pla1) {
                    buttn5.setText("X");
                    pla1=false;
                }
                else
                {buttn5.setText("0");
                    pla1=true;}
                buttn5.setEnabled(false);
                endGame();
            }
        });
        buttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pla1) {
                    buttn6.setText("X");
                    pla1=false;}
                else {
                    buttn6.setText("0");
                    pla1=true;
                }
                buttn6.setEnabled(false);
                endGame();
            }
        });
        buttn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pla1) {
                    buttn7.setText("X");
                    pla1=false;
                }
                else
                { buttn7.setText("0");
                    pla1=true;}
                buttn7.setEnabled(false);
                endGame();
            }

        });
        buttn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pla1)
                { buttn8.setText("X");
                    pla1=false;}
                else
                {buttn8.setText("0");
                    pla1=true;}
                buttn8.setEnabled(false);
                endGame();
            }
        });
        buttn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pla1)
                {buttn9.setText("X");
                    pla1=false;}
                else
                { buttn9.setText("0");
                    pla1=true;}
                buttn9.setEnabled(false);
                endGame();
            }
        });

    }

    public void checkp(){
        if(pla1){
            Toast.makeText(this, "PLAYER X TURN", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "PLAYER 0 TURN", Toast.LENGTH_SHORT).show();
        }

    }
    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        a = buttn1.getText().toString();
        b = buttn2.getText().toString();
        c = buttn3.getText().toString();
        d = buttn4.getText().toString();
        e = buttn5.getText().toString();
        f = buttn6.getText().toString();
        g = buttn7.getText().toString();
        h = buttn8.getText().toString();
        i = buttn9.getText().toString();
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
        }
        if (g.equals("X") && e.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
        }
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
        }
        if (g.equals("O") && e.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
        }

}}
