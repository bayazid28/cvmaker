package com.java.cvmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FAQScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqscreen);
        getSupportActionBar().setTitle("Faq");
    }
}