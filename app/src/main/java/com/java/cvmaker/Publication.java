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

public class Publication extends AppCompatActivity {
    private static final String TAG = "Publication";

    private static final String KEY_ApN1 ="publication1";
    private static final String KEY_ApD1 ="description1";

    private static final String KEY_ApN2 ="publication2";
    private static final String KEY_ApD2 ="description2";

    private static final String KEY_ApN3 ="publication3";
    private static final String KEY_ApD3 ="description3";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    EditText apn1,apn2,apn3;
    EditText apd1,apd2,apd3;
    Button apsave1,apsave2,apsave3;




    Button pbadd1,pbadd2,pbr1,pbr2;
    LinearLayout pblayout2,pblayout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publication);
        getSupportActionBar().setTitle("Publication");

        apn1=findViewById(R.id.pbn1);
        apn2=findViewById(R.id.pbn2);
        apn3=findViewById(R.id.pbn3);

        apd1=findViewById(R.id.pbd1);
        apd2=findViewById(R.id.pbd2);
        apd3=findViewById(R.id.pbd3);

        apsave1=findViewById(R.id.pbsave1);
        apsave2=findViewById(R.id.pbsave2);
        apsave3=findViewById(R.id.pbsave3);

        apsave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aln1=apn1.getText().toString();
                String ald1=apd1.getText().toString();


                Map<String, Object> publicationdata = new HashMap<>();
                publicationdata.put(KEY_ApN1, aln1);
                publicationdata.put(KEY_ApD1, ald1);



                db.collection("Sections 12").document("Publication Data 1").set(publicationdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Publication.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Publication.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        apsave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aln2=apn2.getText().toString();
                String ald2=apd2.getText().toString();


                Map<String, Object> publicationdata = new HashMap<>();
                publicationdata.put(KEY_ApN2, aln2);
                publicationdata.put(KEY_ApD2, ald2);



                db.collection("Sections 12").document("Publication Data 2").set(publicationdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Publication.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Publication.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        apsave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aln3=apn3.getText().toString();
                String ald3=apd3.getText().toString();


                Map<String, Object> publicationdata = new HashMap<>();
                publicationdata.put(KEY_ApN3, aln3);
                publicationdata.put(KEY_ApD3, ald3);



                db.collection("Sections 12").document("Publication Data 3").set(publicationdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Publication.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Publication.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });






        pbadd1=findViewById(R.id.pbadd1);
        pbadd2=findViewById(R.id.pbadd2);

        pbr1=findViewById(R.id.pbremove1);
        pbr2=findViewById(R.id.pbremove2);

        pblayout2=findViewById(R.id.pblayout2);
        pblayout3=findViewById(R.id.pblayout3);

        ScrollView jsc = (ScrollView) findViewById(R.id.jsc);

        jsc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        pbadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pblayout2.setVisibility(View.VISIBLE);
                jsc.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });
            }
        });
        pbadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pblayout3.setVisibility(View.VISIBLE);

            }
        });
        pbr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pblayout2.setVisibility(View.INVISIBLE);
                pblayout3.setVisibility(View.INVISIBLE);
            }
        });
        pbr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pblayout3.setVisibility(View.INVISIBLE);
            }
        });
    }
}