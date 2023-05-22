package com.example.eunachopractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean isfirstInput = true; // 입력값이 처음 입력되는가를 체크
    int resultNumber = 0; // 결과 변수
    char operator = '+'; // 입력 변수

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
                //   Toast.makeText(getApplicationContext(),getButton.getText().toString()
                //         + "버튼이 클릭되었습니다", Toast.LENGTH_LONG).show();
        }
    }
}
