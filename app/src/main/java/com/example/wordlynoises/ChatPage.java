package com.example.wordlynoises;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class ChatPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_page);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        String senderName = getIntent().getStringExtra("SENDER_NAME");
        //title
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null )
        {
            actionBar.setTitle(senderName);
        }
    }
}