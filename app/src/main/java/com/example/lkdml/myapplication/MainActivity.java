package com.example.lkdml.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.texto1);
        tv.setText("hola Android");
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        this.tv.setText("Nos vemos.!");
    }
}
