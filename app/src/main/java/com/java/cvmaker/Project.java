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

public class Project extends AppCompatActivity {
    private static final String TAG = "Project";

    private static final String KEY_PROJECTN1 ="projectname1";
    private static final String KEY_PROJECTD1 ="projectdes1";

    private static final String KEY_PROJECTN2 ="projectname2";
    private static final String KEY_PROJECTD2 ="projectdes2";

    private static final String KEY_PROJECTN3 ="projectname3";
    private static final String KEY_PROJECTD3 ="projectdes3";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    EditText projectn1,projectd1;
    EditText projectn2,projectd2;
    EditText projectn3,projectd3;

    Button psave1,psave2,psave3;



    Button pradd1,pradd2,prr1,prr2;
    LinearLayout prlayout2,prlayout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        getSupportActionBar().setTitle("Project");

        projectn1=findViewById(R.id.projectname1);
        projectn2=findViewById(R.id.projectname2);
        projectn3=findViewById(R.id.projectname3);

        projectd1=findViewById(R.id.projectdes1);
        projectd2=findViewById(R.id.projectdes2);
        projectd3=findViewById(R.id.projectdes3);

        psave1=findViewById(R.id.psave1);
        psave2=findViewById(R.id.psave2);
        psave3=findViewById(R.id.psave3);

        psave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pn1=projectn1.getText().toString();
                String pd1=projectd1.getText().toString();


                Map<String, Object> projectdata = new HashMap<>();
                projectdata.put(KEY_PROJECTN1, pn1);
                projectdata.put(KEY_PROJECTD1, pd1);



                db.collection("Sections 7").document("Project Data 1").set(projectdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Project.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Project.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        psave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pn2=projectn2.getText().toString();
                String pd2=projectd2.getText().toString();


                Map<String, Object> projectdata = new HashMap<>();
                projectdata.put(KEY_PROJECTN2, pn2);
                projectdata.put(KEY_PROJECTD2, pd2);



                db.collection("Sections 7").document("Project Data 2").set(projectdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Project.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Project.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });

        psave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pn3=projectn3.getText().toString();
                String pd3=projectd3.getText().toString();


                Map<String, Object> projectdata = new HashMap<>();
                projectdata.put(KEY_PROJECTN3, pn3);
                projectdata.put(KEY_PROJECTD3, pd3);



                db.collection("Sections 7").document("Project Data 3").set(projectdata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Project.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Project.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });




        pradd1=findViewById(R.id.pradd1);
        pradd2=findViewById(R.id.pradd2);

        prr1=findViewById(R.id.prremove1);
        prr2=findViewById(R.id.prremove2);

        prlayout2=findViewById(R.id.prlayout2);
        prlayout3=findViewById(R.id.prlayout3);

        ScrollView scw1 = (ScrollView) findViewById(R.id.scw1);

        scw1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        pradd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prlayout2.setVisibility(View.VISIBLE);
                scw1.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        return false;
                    }
                });
            }
        });
        pradd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prlayout3.setVisibility(View.VISIBLE);
            }
        });
        prr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prlayout2.setVisibility(View.INVISIBLE);
                prlayout3.setVisibility(View.INVISIBLE);
            }
        });
        prr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prlayout3.setVisibility(View.INVISIBLE);
            }
        });
    }
}