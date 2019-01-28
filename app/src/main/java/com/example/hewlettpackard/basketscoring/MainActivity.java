package com.example.hewlettpackard.basketscoring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.score);
    }

    public void btn1(View view) {
        Toast.makeText(this, "button clicled", Toast.LENGTH_SHORT).show();
        score=score+1;
        text.setText(String.valueOf(score));
    }

    public void btn2(View view) {
        score=score+2;
        text.setText(String.valueOf(score));
    }

    public void btn3(View view) {
        score=score+3;
        text.setText(String.valueOf(score));
    }

    public void btn4(View view) {
        score=0;
        text.setText(String.valueOf(score));
    }
}
