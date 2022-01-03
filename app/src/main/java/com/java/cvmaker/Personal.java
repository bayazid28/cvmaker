package com.java.cvmaker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Personal extends AppCompatActivity {


    private EditText pname;
    private EditText paddress;
    private EditText pemail;
    private EditText pphone;
    private EditText pwebsite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        getSupportActionBar().setTitle("Personal Details");

        pname = findViewById(R.id.pname);
        paddress = findViewById(R.id.paddress);
        pemail = findViewById(R.id.pemail);
        pphone = findViewById(R.id.pphone);
        pwebsite = findViewById(R.id.pwebsite);

        Button padd = findViewById(R.id.padddata);
        DResume dResume = new DResume();
        padd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resume resume = new Resume(pname.getText().toString(),paddress.getText().toString(),
                        pemail.getText().toString(),pphone.getText().toString(),
                        pwebsite.getText().toString());
                dResume.add(resume).addOnSuccessListener(suc->
                        {
                            Toast.makeText(getApplicationContext(),"Save Successfully",Toast.LENGTH_SHORT).show();
                        }
                        ).addOnFailureListener(er->
                        {
                            Toast.makeText(getApplicationContext(),""+er.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                        );
            }
        });








    }
}