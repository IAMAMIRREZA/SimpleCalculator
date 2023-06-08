package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btbacktocalc=findViewById(R.id.button10);
        TextView txtresault=findViewById(R.id.txtresault);
        TextView txtname=findViewById(R.id.txtname);

        Intent intentrecieve=getIntent();
        int c=intentrecieve.getIntExtra("natige",0);
        String username=intentrecieve.getStringExtra("name");

        txtresault.setText("پاسخ شما : "+c);
        txtname.setText("نام شما : "+username);

        btbacktocalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcalc=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intentcalc);
            }
        });

    }
}