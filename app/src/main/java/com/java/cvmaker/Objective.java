package com.java.cvmaker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Objective extends AppCompatActivity {

    private static final String TAG = "Objective";

    private static final String KEY_OBJECTIVE ="Objective";

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    EditText objective;
    Button osave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objective);
        getSupportActionBar().setTitle("Objectives");

        objective=findViewById(R.id.objective);
        osave=findViewById(R.id.osave);

        osave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String osave=objective.getText().toString();

                Map<String, Object> objectivedata = new HashMap<>();
                objectivedata.put(KEY_OBJECTIVE, osave);

                db.collection("Sections 4 ").document("Objective").set(objectivedata)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Objective.this,"Save Successfully",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Objective.this,"Error!Please Try Again.",Toast.LENGTH_SHORT).show();
                                Log.d(TAG,e.toString());
                            }
                        });
            }
        });
    }
}