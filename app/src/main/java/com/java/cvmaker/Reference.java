package com.java.cvmaker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Reference extends AppCompatActivity {
    private static final String TAG = "Reference";

    private static final String KEY_REFNAME1 ="Refername1";
    private static final String KEY_REFJOB1 ="jobtitle1";
    private static final String KEY_REFCOMP1 ="companyname1";
    private static final String KEY_REFCON1 ="contact1";
    private static final String KEY_REFMAIL1 ="mail1";

    private static final String KEY_REFNAME2 ="Refername2";
    private static final String KEY_REFJOB2="jobtitle2";
    private static final String KEY_REFCOMP2 ="companyname2";
    private static final String KEY_REFCON2 ="contact2";
    private static final String KEY_REFMAIL2 ="mail2";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    EditText refname1,refjobtitle1,refcompanyn1,refcontact1,refmail1;
    EditText refname2,refjobtitle2,refcompanyn2,refcontact2,refmail2;

    Button rfsave1,rfsave2;



    Button rfadd1,rfr1;
    LinearLayout rf2layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);
        getSupportActionBar().setTitle("Reference");

        refname1=findViewById(R.id.refname1);
        refname2=findViewById(R.id.refname2);

        refjobtitle1=findViewById(R.id.refjobtitle1);
        refjobtitle2=findViewById(R.id.refjobtitle2);

        refcompanyn1=findViewById(R.id.refcompanyn1);
        refcompanyn2=findViewById(R.id.refcompanyn2);

        refcontact1=findViewById(R.id.refcontact1);
        refcontact2=findViewById(R.id.refcontact2);

        refmail1=findViewById(R.id.refmail1);
        refmail2=findViewById(R.id.refmail2);

        rfsave1=findViewById(R.id.resave1);
        rfsave2=findViewById(R.id.resave2);

        rfsave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rfn1=refname1.getText().toString();
                String rfjob1=refjobtitle1.getText().toString();
                String rfcp1=refcompanyn1.getText().toString();
                String rfct1=refcontact1.getText().toString();
                String rfm1=refmail1.getText().toString();

                Map<String, Object> referencedata = new HashMap<>();
                referencedata.put(KEY_REFNAME1, rfn1);
                referencedata.put(KEY_REFJOB1, rfjob1);
                referencedata.put(KEY_REFCOMP1, rfcp1);
                referencedata.put(KEY_REFCON1, rfct1);
                referencedata.put(KEY_REFMAIL1, rfm1);


                db.collection("Sections 6").document("Reference Data 1").set(referencedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Reference.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Reference.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        rfsave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rfn2=refname2.getText().toString();
                String rfjob2=refjobtitle2.getText().toString();
                String rfcp2=refcompanyn2.getText().toString();
                String rfct2=refcontact2.getText().toString();
                String rfm2=refmail2.getText().toString();

                Map<String, Object> referencedata = new HashMap<>();
                referencedata.put(KEY_REFNAME2, rfn2);
                referencedata.put(KEY_REFJOB2, rfjob2);
                referencedata.put(KEY_REFCOMP2, rfcp2);
                referencedata.put(KEY_REFCON2, rfct2);
                referencedata.put(KEY_REFMAIL2, rfm2);


                db.collection("Sections 6").document("Reference Data 2").set(referencedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Reference.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Reference.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });


        rfadd1=findViewById(R.id.rfadd1);
        rfr1=findViewById(R.id.rfremove1);

        rf2layout=findViewById(R.id.rflayout2);

        rfadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rf2layout.setVisibility(View.VISIBLE);
            }
        });
        rfr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rf2layout.setVisibility(View.INVISIBLE);
            }
        });
    }
}