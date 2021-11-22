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

public class Activities extends AppCompatActivity {

    private static final String TAG = "Activities";

    private static final String KEY_AVN1 ="activities1";
    private static final String KEY_AVD1 ="description1";

    private static final String KEY_AVN2 ="activities2";
    private static final String KEY_AVD2 ="description2";

    private static final String KEY_AVN3 ="activities3";
    private static final String KEY_AVD3 ="description3";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    EditText avn1,avn2,avn3;
    EditText avd1,avd2,avd3;
    Button avsave1,avsave2,avsave3;


    Button atadd1,atadd2,atr1,atr2;
    LinearLayout atlayout2,atlayout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        getSupportActionBar().setTitle("Activities");

        avn1=findViewById(R.id.avn1);
        avn2=findViewById(R.id.avn2);
        avn3=findViewById(R.id.avn3);

        avd1=findViewById(R.id.avd1);
        avd2=findViewById(R.id.avd2);
        avd3=findViewById(R.id.avd3);

        avsave1=findViewById(R.id.avsave1);
        avsave2=findViewById(R.id.avsave2);
        avsave3=findViewById(R.id.avsave3);

        avsave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apn1=avn1.getText().toString();
                String apd1=avd1.getText().toString();


                Map<String, Object> activitiesdata = new HashMap<>();
                activitiesdata.put(KEY_AVN1, apn1);
                activitiesdata.put(KEY_AVD1, apd1);



                db.collection("Sections 11").document("Activities Data 1").set(activitiesdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Activities.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Activities.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        avsave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apn2=avn2.getText().toString();
                String apd2=avd2.getText().toString();


                Map<String, Object> activitiesdata = new HashMap<>();
                activitiesdata.put(KEY_AVN2, apn2);
                activitiesdata.put(KEY_AVD2, apd2);



                db.collection("Sections 11").document("Activities Data 2").set(activitiesdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Activities.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Activities.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        avsave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apn3=avn3.getText().toString();
                String apd3=avd3.getText().toString();


                Map<String, Object> activitiesdata = new HashMap<>();
                activitiesdata.put(KEY_AVN3, apn3);
                activitiesdata.put(KEY_AVD3, apd3);



                db.collection("Sections 11").document("Activities Data 3").set(activitiesdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Activities.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Activities.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });


        atadd1=findViewById(R.id.atadd1);
        atadd2=findViewById(R.id.atadd2);

        atr1=findViewById(R.id.atremove1);
        atr2=findViewById(R.id.atremove2);

        atlayout2=findViewById(R.id.atlayout2);
        atlayout3=findViewById(R.id.atlayout3);

        ScrollView psc = (ScrollView) findViewById(R.id.psc);

        psc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        atadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atlayout2.setVisibility(View.VISIBLE);
                psc.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });
            }
        });
        atadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atlayout3.setVisibility(View.VISIBLE);

            }
        });
        atr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atlayout2.setVisibility(View.INVISIBLE);
                atlayout3.setVisibility(View.INVISIBLE);
            }
        });
        atr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atlayout3.setVisibility(View.INVISIBLE);
            }
        });

    }
}