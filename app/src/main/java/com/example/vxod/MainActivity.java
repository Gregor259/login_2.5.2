package com.example.vxod;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    TextView text;
    EditText n, p;
    static final String Username = "Grisha", Password = "2004";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.button);
        text = findViewById(R.id.text);
        n = findViewById(R.id.textView3);
        p = findViewById(R.id.password);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = n.getText().toString();
        String pass = p.getText().toString();
        if (name.equals(Username) && pass.equals(Password)){
            text.setTextColor(ContextCompat.getColor(this, R.color.new_green));
            text.setText("Верно");

        }
        else{
            text.setTextColor(ContextCompat.getColor(this, R.color.red));
            text.setText("Вы ошиблись в логине или пароле");

        }
    }
}