package com.java.cvmaker;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class Template1 extends AppCompatActivity {

  RecyclerView recyclerView;
  ArrayList<Resume> resumeArrayList;
  MyAdapter myAdapter;
  FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template1);
        getSupportActionBar().setTitle("Template 1");

        recyclerView=findViewById(R.id.rcview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        db = FirebaseFirestore.getInstance();
        resumeArrayList=new ArrayList<Resume>();
        myAdapter = new MyAdapter(Template1.this,resumeArrayList);

        EventListener();

    }
    private void EventListener(){
        db.collection("Sections 1")
                .addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @Override
                    public void onEvent(@Nullable  QuerySnapshot value, @Nullable  FirebaseFirestoreException error) {
                        if(error!=null){
                           Log.e("Firestore error",error.getMessage());
                           return;
                        }
                        for(DocumentChange dc : value.getDocumentChanges()){

                            if(dc.getType() == DocumentChange.Type.ADDED){
                                resumeArrayList.add(dc.getDocument().toObject(Resume.class));
                            }
                            myAdapter.notifyDataSetChanged();
                        }
                    }
                });
    }
}