package com.example.exp_4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity
{ TextView name, uid;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.showName);
        uid = findViewById(R.id.showUid);
        Intent incomingIntent = getIntent();
        String sName=incomingIntent.getStringExtra("studentName");
        String sUid = incomingIntent.getStringExtra("studentUid");
        name.setText(sName);
        uid.setText(sUid);
    }
}