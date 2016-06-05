package com.aleksus.recruiter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SelectActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);

        textView = (TextView) findViewById(R.id.textView4);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText("Добро пожаловать в " + name);
    }
}
