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

public class Education extends AppCompatActivity {
    private static final String TAG = "Educational";

    private static final String KEY_COURSE1 ="Course1";
    private static final String KEY_VERSITY1 ="Versity1";
    private static final String KEY_GRADE1 ="Grade1";
    private static final String KEY_YEAR1 ="Year1";

    private static final String KEY_COURSE2 ="Course2";
    private static final String KEY_VERSITY2="Versity2";
    private static final String KEY_GRADE2="Grade2";
    private static final String KEY_YEAR2 ="Year2";

    private static final String KEY_COURSE3 ="Course3";
    private static final String KEY_VERSITY3="Versity3";
    private static final String KEY_GRADE3 ="Grade3";
    private static final String KEY_YEAR3 ="Year3";

    private static final String KEY_COURSE4 ="Course4";
    private static final String KEY_VERSITY4 ="Versity4";
    private static final String KEY_GRADE4="Grade4";
    private static final String KEY_YEAR4 ="Year4";



    private FirebaseFirestore db = FirebaseFirestore.getInstance();



    Button remove1,remove2,remove3;
    Button education1;
    Button education2id;
    Button education3id;
    LinearLayout education2layout;
    LinearLayout getEducation3layout;
    LinearLayout getGetEducation4layout;

    EditText coursename1,versityname1,grade1,year1;
    EditText coursename2,versityname2,grade2,year2;
    EditText coursename3,versityname3,grade3,year3;
    EditText coursename4,versityname4,grade4,year4;

    Button esave1,esave2,esave3,esave4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        getSupportActionBar().setTitle("Educational Background");

        coursename1=findViewById(R.id.coursename1);
        coursename2=findViewById(R.id.coursename2);
        coursename3=findViewById(R.id.coursename3);
        coursename4=findViewById(R.id.coursename4);

        versityname1=findViewById(R.id.versityname1);
        versityname2=findViewById(R.id.versityname2);
        versityname3=findViewById(R.id.versityname3);
        versityname4=findViewById(R.id.versityname4);

        grade1=findViewById(R.id.grade1);
        grade2=findViewById(R.id.grade2);
        grade3=findViewById(R.id.grade3);
        grade4=findViewById(R.id.grade4);

        year1=findViewById(R.id.year1);
        year2=findViewById(R.id.year2);
        year3=findViewById(R.id.year3);
        year4=findViewById(R.id.year4);

        esave1=findViewById(R.id.esave1);
        esave2=findViewById(R.id.esave2);
        esave3=findViewById(R.id.esave3);
        esave4=findViewById(R.id.esave4);

        esave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String coursen1=coursename1.getText().toString();
                String versityn1=versityname1.getText().toString();
                String graden1=grade1.getText().toString();
                String yearn1=year1.getText().toString();

                Map<String, Object> educationaldata = new HashMap<>();
                educationaldata.put(KEY_COURSE1, coursen1);
                educationaldata.put(KEY_VERSITY1, versityn1);
                educationaldata.put(KEY_GRADE1, graden1);
                educationaldata.put(KEY_YEAR1, yearn1);

                db.collection("Sections 2 ").document("Educational Data 1").set(educationaldata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Education.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Education.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        esave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String coursen2=coursename2.getText().toString();
                String versityn2=versityname2.getText().toString();
                String graden2=grade2.getText().toString();
                String yearn2=year2.getText().toString();

                Map<String, Object> educationaldata = new HashMap<>();
                educationaldata.put(KEY_COURSE2, coursen2);
                educationaldata.put(KEY_VERSITY2, versityn2);
                educationaldata.put(KEY_GRADE2, graden2);
                educationaldata.put(KEY_YEAR2, yearn2);

                db.collection("Sections 2 ").document("Educational Data 2").set(educationaldata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Education.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Education.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        esave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String coursen3=coursename3.getText().toString();
                String versityn3=versityname3.getText().toString();
                String graden3=grade3.getText().toString();
                String yearn3=year3.getText().toString();

                Map<String, Object> educationaldata = new HashMap<>();
                educationaldata.put(KEY_COURSE3, coursen3);
                educationaldata.put(KEY_VERSITY3, versityn3);
                educationaldata.put(KEY_GRADE3, graden3);
                educationaldata.put(KEY_YEAR3, yearn3);

                db.collection("Sections 2 ").document("Educational Data 3").set(educationaldata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Education.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Education.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        esave4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String coursen4=coursename4.getText().toString();
                String versityn4=versityname4.getText().toString();
                String graden4=grade4.getText().toString();
                String yearn4=year4.getText().toString();

                Map<String, Object> educationaldata = new HashMap<>();
                educationaldata.put(KEY_COURSE4, coursen4);
                educationaldata.put(KEY_VERSITY4, versityn4);
                educationaldata.put(KEY_GRADE4, graden4);
                educationaldata.put(KEY_YEAR4, yearn4);

                db.collection("Sections 2 ").document("Educational Data 4").set(educationaldata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Education.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Education.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        remove1 = findViewById(R.id.remove1);
        remove2 = findViewById(R.id.remove2);
        remove3 = findViewById(R.id.remove3);

        education1 = findViewById(R.id.education1);
        education2id = findViewById(R.id.education2id);
        education3id = findViewById(R.id.education3id);
        education2layout = findViewById(R.id.education2layout);
        getEducation3layout = findViewById(R.id.education3layout);
        getGetEducation4layout = findViewById(R.id.education4layout);
        ScrollView sw = (ScrollView) findViewById(R.id.scview);

        sw.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        education1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                education2layout.setVisibility(View.VISIBLE);
                sw.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });

            }
        });
        remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                education2layout.setVisibility(View.INVISIBLE);
                getEducation3layout.setVisibility(View.INVISIBLE);
                getGetEducation4layout.setVisibility(View.INVISIBLE);
            }
        });
        education2id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEducation3layout.setVisibility(View.VISIBLE);
                sw.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });

            }
        });
        remove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEducation3layout.setVisibility(View.INVISIBLE);
                getGetEducation4layout.setVisibility(View.INVISIBLE);
            }
        });
        education3id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getGetEducation4layout.setVisibility(View.VISIBLE);
                sw.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });

            }
        });
        remove3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getGetEducation4layout.setVisibility(View.INVISIBLE);
            }
        });

    }
}