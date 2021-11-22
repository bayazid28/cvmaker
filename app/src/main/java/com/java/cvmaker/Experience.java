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

public class Experience extends AppCompatActivity {

    private static final String TAG = "Experience";

    private static final String KEY_COMPANYNAME1 ="Companyname1";
    private static final String KEY_JOBTITLE1 ="jobtitle1";
    private static final String KEY_SDATE1 ="startdate1";
    private static final String KEY_EDATE1 ="enddate1";
    private static final String KEY_JOBDETAIL1 ="jobdetail1";

    private static final String KEY_COMPANYNAME2 ="Companyname2";
    private static final String KEY_JOBTITLE2 ="jobtitle2";
    private static final String KEY_SDATE2 ="startdate2";
    private static final String KEY_EDATE2 ="enddate2";
    private static final String KEY_JOBDETAIL2 ="jobdetail2";

    private static final String KEY_COMPANYNAME3 ="Companyname3";
    private static final String KEY_JOBTITLE3 ="jobtitle3";
    private static final String KEY_SDATE3 ="startdate3";
    private static final String KEY_EDATE3 ="enddate3";
    private static final String KEY_JOBDETAIL3 ="jobdetail3";

    private static final String KEY_COMPANYNAME4 ="Companyname4";
    private static final String KEY_JOBTITLE4 ="jobtitle4";
    private static final String KEY_SDATE4 ="startdate4";
    private static final String KEY_EDATE4 ="enddate4";
    private static final String KEY_JOBDETAIL4 ="jobdetail4";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();


    EditText companyname1,companyname2,companyname3,companyname4;
    EditText jobtitle1,jobtitle2,jobtitle3,jobtitle4;
    EditText sdate1,sdate2,sdate3,sdate4;
    EditText edate1,edate2,edate3,edate4;
    EditText jobdetail1,jobdetail2,jobdetail3,jobdetail4;

    Button exsave1,exsave2,exsave3,exsave4;



    Button expadd1,expadd2,expadd3;
    Button expr1,expr2,expr3;
    LinearLayout exp2layout,exp3layout,exp4layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);
        getSupportActionBar().setTitle("Experience");

        companyname1=findViewById(R.id.companyname1);
        companyname2=findViewById(R.id.companyname2);
        companyname3=findViewById(R.id.companyname3);
        companyname4=findViewById(R.id.companyname4);

        jobtitle1=findViewById(R.id.jobtitle1);
        jobtitle2=findViewById(R.id.jobtitle2);
        jobtitle3=findViewById(R.id.jobtitle3);
        jobtitle4=findViewById(R.id.jobtitle4);

        sdate1=findViewById(R.id.sdate1);
        sdate2=findViewById(R.id.sdate2);
        sdate3=findViewById(R.id.sdate3);
        sdate4=findViewById(R.id.sdate4);

        edate1=findViewById(R.id.edate1);
        edate2=findViewById(R.id.edate2);
        edate3=findViewById(R.id.edate3);
        edate4=findViewById(R.id.edate4);

        jobdetail1=findViewById(R.id.jobdetail1);
        jobdetail2=findViewById(R.id.jobdetail2);
        jobdetail3=findViewById(R.id.jobdetail3);
        jobdetail4=findViewById(R.id.jobdetail4);

        exsave1=findViewById(R.id.exsave1);
        exsave2=findViewById(R.id.exsave2);
        exsave3=findViewById(R.id.exsave3);
        exsave4=findViewById(R.id.exsave4);

        exsave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String com1=companyname1.getText().toString();
                String job1=jobtitle1.getText().toString();
                String sd1=sdate1.getText().toString();
                String ed1=edate1.getText().toString();
                String jobt1=jobdetail1.getText().toString();

                Map<String, Object> experiencedata = new HashMap<>();
                experiencedata.put(KEY_COMPANYNAME1, com1);
                experiencedata.put(KEY_JOBTITLE1, job1);
                experiencedata.put(KEY_SDATE1, sd1);
                experiencedata.put(KEY_EDATE1, ed1);
                experiencedata.put(KEY_JOBDETAIL1, jobt1);


                db.collection("Sections 5").document("Experience Data 1").set(experiencedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Experience.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Experience.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        exsave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String com2=companyname2.getText().toString();
                String job2=jobtitle2.getText().toString();
                String sd2=sdate2.getText().toString();
                String ed2=edate2.getText().toString();
                String jobt2=jobdetail2.getText().toString();

                Map<String, Object> experiencedata = new HashMap<>();
                experiencedata.put(KEY_COMPANYNAME2, com2);
                experiencedata.put(KEY_JOBTITLE2, job2);
                experiencedata.put(KEY_SDATE2, sd2);
                experiencedata.put(KEY_EDATE2, ed2);
                experiencedata.put(KEY_JOBDETAIL2, jobt2);


                db.collection("Sections 5").document("Experience Data 2").set(experiencedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Experience.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Experience.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        exsave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String com3=companyname3.getText().toString();
                String job3=jobtitle3.getText().toString();
                String sd3=sdate3.getText().toString();
                String ed3=edate3.getText().toString();
                String jobt3=jobdetail3.getText().toString();

                Map<String, Object> experiencedata = new HashMap<>();
                experiencedata.put(KEY_COMPANYNAME3, com3);
                experiencedata.put(KEY_JOBTITLE3, job3);
                experiencedata.put(KEY_SDATE3, sd3);
                experiencedata.put(KEY_EDATE3, ed3);
                experiencedata.put(KEY_JOBDETAIL3, jobt3);


                db.collection("Sections 5").document("Experience Data 3").set(experiencedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Experience.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Experience.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        exsave4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String com4=companyname4.getText().toString();
                String job4=jobtitle4.getText().toString();
                String sd4=sdate4.getText().toString();
                String ed4=edate4.getText().toString();
                String jobt4=jobdetail4.getText().toString();

                Map<String, Object> experiencedata = new HashMap<>();
                experiencedata.put(KEY_COMPANYNAME4, com4);
                experiencedata.put(KEY_JOBTITLE4, job4);
                experiencedata.put(KEY_SDATE4, sd4);
                experiencedata.put(KEY_EDATE4, ed4);
                experiencedata.put(KEY_JOBDETAIL4, jobt4);


                db.collection("Sections 5").document("Experience Data 4").set(experiencedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Experience.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Experience.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });



        expadd1=findViewById(R.id.expadd1);
        expadd2=findViewById(R.id.expadd2);
        expadd3=findViewById(R.id.expadd3);

        exp2layout=findViewById(R.id.explayout2);
        exp3layout=findViewById(R.id.exp3layout);
        exp4layout=findViewById(R.id.exp4layout);

        expr1=findViewById(R.id.expremove1);
        expr2=findViewById(R.id.expremove2);
        expr3=findViewById(R.id.expremove3);



        expadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp2layout.setVisibility(View.VISIBLE);

            }
        });
        expadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp3layout.setVisibility(View.VISIBLE);
            }
        });
        expadd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp4layout.setVisibility(View.VISIBLE);
            }
        });
        expr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp2layout.setVisibility(View.INVISIBLE);
                exp3layout.setVisibility(View.INVISIBLE);
                exp4layout.setVisibility(View.INVISIBLE);
            }
        });
        expr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp3layout.setVisibility(View.INVISIBLE);
                exp4layout.setVisibility(View.INVISIBLE);
            }
        });
        expr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp4layout.setVisibility(View.INVISIBLE);
            }
        });
    }
}