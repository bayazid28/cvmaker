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

public class Acheivement extends AppCompatActivity {
    private static final String TAG = "Acheivement";

    private static final String KEY_ACN1 ="acheivement1";
    private static final String KEY_ACD1 ="description1";

    private static final String KEY_ACN2 ="acheivement2";
    private static final String KEY_ACD2 ="description2";

    private static final String KEY_ACN3 ="acheivement3";
    private static final String KEY_ACD3 ="description3";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    EditText acn1,acn2,acn3;
    EditText acd1,acd2,acd3;
    Button acsave1,acsave2,acsave3;





    Button acadd1,acadd2,acr1,acr2;
    LinearLayout aclayout2,aclayout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acheivement);
        getSupportActionBar().setTitle("Acheivement and Awards");

        acn1=findViewById(R.id.acn1);
        acn2=findViewById(R.id.acn2);
        acn3=findViewById(R.id.acn3);

        acd1=findViewById(R.id.acd1);
        acd2=findViewById(R.id.acd2);
        acd3=findViewById(R.id.acd3);

        acsave1=findViewById(R.id.acsave1);
        acsave2=findViewById(R.id.acsave2);
        acsave3=findViewById(R.id.acsave3);


        acsave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String an1=acn1.getText().toString();
                String ad1=acd1.getText().toString();


                Map<String, Object> acheivementdata = new HashMap<>();
                acheivementdata.put(KEY_ACN1, an1);
                acheivementdata.put(KEY_ACD1, ad1);



                db.collection("Sections 10").document("Acheivement Data 1").set(acheivementdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Acheivement.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Acheivement.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        acsave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String an2=acn2.getText().toString();
                String ad2=acd2.getText().toString();


                Map<String, Object> acheivementdata = new HashMap<>();
                acheivementdata.put(KEY_ACN2, an2);
                acheivementdata.put(KEY_ACD2, ad2);



                db.collection("Sections 10").document("Acheivement Data 2").set(acheivementdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Acheivement.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Acheivement.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        acsave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String an3=acn3.getText().toString();
                String ad3=acd3.getText().toString();


                Map<String, Object> acheivementdata = new HashMap<>();
                acheivementdata.put(KEY_ACN3, an3);
                acheivementdata.put(KEY_ACD3, ad3);



                db.collection("Sections 10").document("Acheivement Data 3").set(acheivementdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Acheivement.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Acheivement.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });


        acadd1=findViewById(R.id.acadd1);
        acadd2=findViewById(R.id.acadd2);

        acr1=findViewById(R.id.acremove1);
        acr2=findViewById(R.id.acremove2);

        aclayout2=findViewById(R.id.aclayout2);
        aclayout3=findViewById(R.id.aclayout3);

        ScrollView asc = (ScrollView) findViewById(R.id.asc);

        asc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        acadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aclayout2.setVisibility(View.VISIBLE);
                asc.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });

            }
        });
        acadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aclayout3.setVisibility(View.VISIBLE);

            }
        });
        acr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aclayout2.setVisibility(View.INVISIBLE);
                aclayout3.setVisibility(View.INVISIBLE);
            }
        });
        acr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aclayout3.setVisibility(View.INVISIBLE);
            }
        });

    }
}