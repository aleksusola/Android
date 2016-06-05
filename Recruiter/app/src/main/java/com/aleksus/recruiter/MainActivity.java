package com.aleksus.recruiter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_Sup;
    Button btn_;
    Button btn_Exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btn_Sup = (Button) findViewById(R.id.btn_Sup);
        btn_Sup.setOnClickListener(this);
        btn_ = (Button) findViewById(R.id.btn_);
        btn_.setOnClickListener(this);
        btn_Exit= (Button) findViewById(R.id.btn_Exit);
        btn_Exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Sup:
                Intent intent = new Intent(this, SupSelectActivity.class);
                intent.putExtra("name", btn_Sup.getText().toString());
                startActivity(intent);
                break;
            case R.id.btn_:
                Intent intent1 = new Intent(this, SelectActivity.class);
                intent1.putExtra("name", btn_.getText().toString());
                startActivity(intent1);
                break;
            case R.id.btn_Exit:
                finish();
                break;
            default:
                break;
        }
    }
}
