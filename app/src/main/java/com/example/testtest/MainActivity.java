package com.example.testtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                if (editText.getText().toString().equals("4")){
                    Intent intent = new Intent(this, MainActivity2.class);
                    startActivity(intent);
                }
                else {
                    Toast toast = Toast.makeText(this,"Попробуй снова!", Toast.LENGTH_SHORT);
                    toast.show();
                }
        }

    }
}