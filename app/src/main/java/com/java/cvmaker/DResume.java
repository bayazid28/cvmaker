package com.java.cvmaker;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class DResume {
    private DatabaseReference databaseReference;
    public DResume(){
        FirebaseDatabase db=FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Resume.class.getSimpleName());
    }
    public Task<Void> add(Resume resume){

        return databaseReference.push().setValue(resume);
    }
    public Query get(){
        return databaseReference.orderByKey();
    }
}
