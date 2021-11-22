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

public class Language extends AppCompatActivity {
    private static final String TAG = "Language";

    private static final String KEY_LNG1 ="language1";

    private static final String KEY_LNG2 ="language2";

    private static final String KEY_LNG3 ="language3";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();



    EditText lng1,lng2,lng3;
    Button lsave1,lsave2,lsave3;

    Button lnadd1,lnadd2,lnr1,lnr2;
    LinearLayout lnlayout2,lnlayout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        getSupportActionBar().setTitle("Language");

        lng1=findViewById(R.id.lng1);
        lng2=findViewById(R.id.lng2);
        lng3=findViewById(R.id.lng3);

        lsave1=findViewById(R.id.lsave1);
        lsave2=findViewById(R.id.lsave2);
        lsave3=findViewById(R.id.lsave3);

        lsave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ln1=lng1.getText().toString();


                Map<String, Object> languagedata = new HashMap<>();
                languagedata.put(KEY_LNG1, ln1);



                db.collection("Sections 8").document("Language Data 1").set(languagedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Language.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Language.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        lsave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ln2=lng2.getText().toString();


                Map<String, Object> languagedata = new HashMap<>();
                languagedata.put(KEY_LNG2, ln2);



                db.collection("Sections 8").document("Language Data 2").set(languagedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Language.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Language.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        lsave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ln3=lng3.getText().toString();


                Map<String, Object> languagedata = new HashMap<>();
                languagedata.put(KEY_LNG3, ln3);



                db.collection("Sections 8").document("Language Data 3").set(languagedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Language.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Language.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });


        lnadd1=findViewById(R.id.lnadd1);
        lnadd2=findViewById(R.id.lnadd2);

        lnr1=findViewById(R.id.lnremove1);
        lnr2=findViewById(R.id.lnremove2);

        lnlayout2=findViewById(R.id.lnlayout2);
        lnlayout3=findViewById(R.id.lnlayout3);

        ScrollView lsc = (ScrollView) findViewById(R.id.lsc);

        lsc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        lnadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnlayout2.setVisibility(View.VISIBLE);

            }
        });
        lnadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnlayout3.setVisibility(View.VISIBLE);
                lsc.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });
            }
        });
        lnr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnlayout2.setVisibility(View.INVISIBLE);
                lnlayout3.setVisibility(View.INVISIBLE);
            }
        });
        lnr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnlayout3.setVisibility(View.INVISIBLE);
            }
        });

    }
}