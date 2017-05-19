package com.example.androidrandomchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { //metoda wywoływana raz po utworzeniu aktywnosci
        super.onCreate(savedInstanceState);
        //okresla uklad interfejsu zdefiniowany w pliku xml activity_display_message
        setContentView(R.layout.activity_display_message);

    }
}
