package com.example.beginnera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,password;
    Button sumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        sumbitActionButton();


    }

    private void initView() {
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        sumbit = findViewById(R.id.clicked);
    }
    private void check() {
        if (name.getText().toString().isEmpty()==true||password.getText().toString().isEmpty()==true){
            Toast.makeText(MainActivity.this,"Please donnot leave any field empty",Toast.LENGTH_LONG).show();
        }else {

            Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_LONG).show();
        }
    }

    private void sumbitActionButton() {
        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });
    }

}