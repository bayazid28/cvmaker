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

public class Interest extends AppCompatActivity {
    private static final String TAG = "Interest";

    private static final String KEY_HBY1 ="hobby1";
    private static final String KEY_HBY2 ="hobby2";
    private static final String KEY_HBY3 ="hobby3";
    private static final String KEY_HBY4 ="hobby4";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();


    EditText hby1,hby2,hby3,hby4;
    Button hsave1,hsave2,hsave3,hsave4;

    Button hbadd1,hbadd2,hbadd3,hbr1,hbr2,hbr3;
    LinearLayout hblayout2,hblayout3,hblayout4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);
        getSupportActionBar().setTitle("Interest");

        hby1=findViewById(R.id.hby1);
        hby2=findViewById(R.id.hby2);
        hby3=findViewById(R.id.hby3);
        hby4=findViewById(R.id.hby4);

        hsave1=findViewById(R.id.hsave1);
        hsave2=findViewById(R.id.hsave2);
        hsave3=findViewById(R.id.hsave3);
        hsave4=findViewById(R.id.hsave4);


        hsave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h1=hby1.getText().toString();


                Map<String, Object> interestdata = new HashMap<>();
                interestdata.put(KEY_HBY1, h1);



                db.collection("Sections 9").document("Language Data 1").set(interestdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Interest.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Interest.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        hsave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h2=hby2.getText().toString();


                Map<String, Object> interestdata = new HashMap<>();
                interestdata.put(KEY_HBY2, h2);



                db.collection("Sections 9").document("Language Data 2").set(interestdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Interest.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Interest.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        hsave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h3=hby3.getText().toString();


                Map<String, Object> interestdata = new HashMap<>();
                interestdata.put(KEY_HBY3, h3);



                db.collection("Sections 9").document("Language Data 3").set(interestdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Interest.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Interest.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        hsave4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h4=hby4.getText().toString();


                Map<String, Object> interestdata = new HashMap<>();
                interestdata.put(KEY_HBY4, h4);



                db.collection("Sections 9").document("Language Data 4").set(interestdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Interest.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Interest.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });



        hbadd1=findViewById(R.id.hbadd1);
        hbadd2=findViewById(R.id.hbadd2);
        hbadd3=findViewById(R.id.hbadd3);

        hbr1=findViewById(R.id.hbremove1);
        hbr2=findViewById(R.id.hbremove2);
        hbr3=findViewById(R.id.hbremove3);

        hblayout2=findViewById(R.id.hblayout2);
        hblayout3=findViewById(R.id.hblayout3);
        hblayout4=findViewById(R.id.hblayout4);

        ScrollView hsc = (ScrollView) findViewById(R.id.hsc);

        hsc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        hbadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hblayout2.setVisibility(View.VISIBLE);
            }
        });
        hbadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hblayout3.setVisibility(View.VISIBLE);
                hsc.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });
            }
        });
        hbadd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hblayout4.setVisibility(View.VISIBLE);
            }
        });
        hbr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hblayout2.setVisibility(View.INVISIBLE);
                hblayout3.setVisibility(View.INVISIBLE);
                hblayout4.setVisibility(View.INVISIBLE);
            }
        });
        hbr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hblayout3.setVisibility(View.INVISIBLE);
                hblayout4.setVisibility(View.INVISIBLE);
            }
        });
        hbr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hblayout4.setVisibility(View.INVISIBLE);
            }
        });
    }
}