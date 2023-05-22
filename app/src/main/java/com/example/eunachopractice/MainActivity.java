package com.example.eunachopractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int resultNum = 0;
    boolean isfirstInput = true;
    char operator = '+';
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.result_text);
    }

    public void buttonClick(View view) {
        Button getButton = findViewById(view.getId());
        switch(view.getId()){
            default:
                   Toast.makeText(getApplicationContext(),getButton.getText().toString()
                         + "버튼이 클릭되었습니다", Toast.LENGTH_LONG).show();

                break;
        }

    }
}
