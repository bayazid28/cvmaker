package com.java.cvmaker;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Personal extends AppCompatActivity {

    private static final String TAG = "Personal";

    private static final String KEY_NAME ="Name";
    private static final String KEY_ADDRESS ="Address";
    private static final String KEY_EMAIL ="Email";
    private static final String KEY_PHONE ="Phone";
    private static final String KEY_WEBSITE ="Website";

    private EditText pname;
    private EditText paddress;
    private EditText pemail;
    private EditText pphone;
    private EditText pwebsite;



    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference sec1 = db.document("Sections 1/Personal Data");

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

        padd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=pname.getText().toString();
                String address=paddress.getText().toString();
                String email=pemail.getText().toString();
                String phone=pphone.getText().toString();
                String website=pwebsite.getText().toString();

                Map<String, Object> personaldata = new HashMap<>();
                personaldata.put(KEY_NAME, name);
                personaldata.put(KEY_ADDRESS, address);
                personaldata.put(KEY_EMAIL, email);
                personaldata.put(KEY_PHONE, phone);
                personaldata.put(KEY_WEBSITE, website);



                sec1.set(personaldata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Personal.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Personal.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });



    }
}