package com.java.cvmaker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class skill extends AppCompatActivity {

    private static final String TAG = "Skill";

    private static final String KEY_SKILLNAME1 ="Skillname1";
    private static final String KEY_SKILLDES1 ="Skilldes1";

    private static final String KEY_SKILLNAME2 ="Skillname2";
    private static final String KEY_SKILLDES2 ="Skilldes2";

    private static final String KEY_SKILLNAME3 ="Skillname3";
    private static final String KEY_SKILLDES3 ="Skilldes3";

    private static final String KEY_SKILLNAME4 ="Skillname4";
    private static final String KEY_SKILLDES4 ="Skilldes4";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();


    Button skadd1,skadd2,skadd3;
    LinearLayout sklayout2,sklayout3,sklayout4;
    Button skr1,skr2,skr3;

    EditText skillname1,skilldes1;
    EditText skillname2,skilldes2;
    EditText skillname3,skilldes3;
    EditText skillname4,skilldes4;

    Button ssave1,ssave2,ssave3,ssave4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);
        getSupportActionBar().setTitle("Skills");

        skillname1=findViewById(R.id.skillname1);
        skilldes1=findViewById(R.id.skilldes1);

        skillname2=findViewById(R.id.skillname2);
        skilldes2=findViewById(R.id.skilldes2);

        skillname3=findViewById(R.id.skillname3);
        skilldes3=findViewById(R.id.skilldes3);

        skillname4=findViewById(R.id.skillname4);
        skilldes4=findViewById(R.id.skilldes4);

        ssave1=findViewById(R.id.ssave1);
        ssave2=findViewById(R.id.ssave2);
        ssave3=findViewById(R.id.ssave3);
        ssave4=findViewById(R.id.ssave4);




        skillname1=findViewById(R.id.skillname1);
        skilldes1=findViewById(R.id.skilldes1);

        skillname2=findViewById(R.id.skillname2);
        skilldes2=findViewById(R.id.skilldes2);

        skillname3=findViewById(R.id.skillname3);
        skilldes3=findViewById(R.id.skilldes3);

        skillname4=findViewById(R.id.skillname4);
        skilldes4=findViewById(R.id.skilldes4);

        Button ssave1,ssave2,ssave3,ssave4;

        ssave1=findViewById(R.id.ssave1);
        ssave2=findViewById(R.id.ssave2);
        ssave3=findViewById(R.id.ssave3);
        ssave4=findViewById(R.id.ssave4);



        skadd1=findViewById(R.id.skadd1);
        skadd2=findViewById(R.id.skadd2);
        skadd3=findViewById(R.id.skadd3);

        sklayout2=findViewById(R.id.sklayout2);
        sklayout3=findViewById(R.id.sklayout3);
        sklayout4=findViewById(R.id.sklayout4);

        skr1=findViewById(R.id.skillremove1);
        skr2=findViewById(R.id.skillremove2);
        skr3=findViewById(R.id.skillremove3);


        ssave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skilln1=skillname1.getText().toString();
                String skilldesn1=skilldes1.getText().toString();

                Map<String, Object> skilldata = new HashMap<>();
                skilldata.put(KEY_SKILLNAME1, skilln1);
                skilldata.put(KEY_SKILLDES1, skilldesn1);


                db.collection("Sections 3 ").document("Skill Data 1").set(skilldata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(skill.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(skill.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        ssave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skilln2=skillname2.getText().toString();
                String skilldesn2=skilldes2.getText().toString();

                Map<String, Object> skilldata = new HashMap<>();
                skilldata.put(KEY_SKILLNAME2, skilln2);
                skilldata.put(KEY_SKILLDES2, skilldesn2);


                db.collection("Sections 3 ").document("Skill Data 2").set(skilldata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(skill.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(skill.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        ssave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skilln3=skillname3.getText().toString();
                String skilldesn3=skilldes3.getText().toString();

                Map<String, Object> skilldata = new HashMap<>();
                skilldata.put(KEY_SKILLNAME3, skilln3);
                skilldata.put(KEY_SKILLDES3, skilldesn3);


                db.collection("Sections 3 ").document("Skill Data 3").set(skilldata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(skill.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(skill.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        ssave4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skilln4=skillname4.getText().toString();
                String skilldesn4=skilldes4.getText().toString();

                Map<String, Object> skilldata = new HashMap<>();
                skilldata.put(KEY_SKILLNAME4, skilln4);
                skilldata.put(KEY_SKILLDES4, skilldesn4);


                db.collection("Sections 3 ").document("Skill Data 4").set(skilldata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(skill.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(skill.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });





        ScrollView sws1 = (ScrollView) findViewById(R.id.sws1);

        sws1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        skadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sklayout2.setVisibility(View.VISIBLE);
                sws1.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });
            }
        });
        skadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sklayout3.setVisibility(View.VISIBLE);
            }
        });
        skadd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sklayout4.setVisibility(View.VISIBLE);
            }
        });
        skr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sklayout2.setVisibility(View.INVISIBLE);
                sklayout3.setVisibility(View.INVISIBLE);
                sklayout4.setVisibility(View.INVISIBLE);
            }
        });
        skr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sklayout3.setVisibility(View.INVISIBLE);
                sklayout4.setVisibility(View.INVISIBLE);
            }
        });
        skr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sklayout4.setVisibility(View.INVISIBLE);
            }
        });

    }
}