package com.example.myportifolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void education(View view) {
        Intent i = new Intent(MainMenu.this, iEducation.class);
        startActivity(i);
    }

    public void calendar(View view) {
        Intent i = new Intent(MainMenu.this, iCalendar.class);
        startActivity(i);
    }

    public void payment(View view) {
        Intent i = new Intent(MainMenu.this, iPayment.class);
        startActivity(i);
    }

    public void about(View view) {
        Intent i = new Intent(MainMenu.this, iAbout.class);
        startActivity(i);
    }
}