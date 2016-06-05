package com.aleksus.recruiter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SupSelectActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button btn_Vac;
    Button btn_Inbox;
    Button btn_Sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sup_select);

        textView = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText("Добро пожаловать в " + name);

        btn_Vac = (Button) findViewById(R.id.btn_Vac);
        btn_Vac.setOnClickListener(this);
        btn_Inbox = (Button) findViewById(R.id.btn_Inbox);
        btn_Inbox.setOnClickListener(this);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Vac:
                Intent intent3 = new Intent(this, SupVacancyActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_Inbox:
                Intent intent4 = new Intent(this, SupInboxActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_Sub:
                Intent intent5 = new Intent(this, SupSubsActivity.class);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}
