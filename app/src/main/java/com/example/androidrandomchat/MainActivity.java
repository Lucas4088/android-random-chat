package com.example.androidrandomchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startChat(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity1.class);
        startActivity(intent);
    }

}
