package com.example.exp_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity
{ EditText name, uid;
    AppCompatButton goNext;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        uid = findViewById(R.id.uid);
        goNext = findViewById(R.id.goNext);
        goNext.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View view) {
            Intent goToNextActivity = new Intent(MainActivity.this, MainActivity2.class);
            String sName = name.getText().toString();
            String sUid = uid.getText().toString();
            goToNextActivity.putExtra("studentName", sName);
            goToNextActivity.putExtra("studentUid", sUid);
            startActivity(goToNextActivity);
        }
        });
    }
}