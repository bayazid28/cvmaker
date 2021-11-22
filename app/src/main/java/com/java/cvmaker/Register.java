package com.java.cvmaker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    TextView al;
    EditText emailId,password,cpassword;
    Button btnSignUp;
    FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        al = findViewById(R.id.al);
        mFirebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.signupedt);
        password = findViewById(R.id.signupps);
        cpassword=findViewById(R.id.csignupps);
        btnSignUp = findViewById(R.id.signupbtn);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailId.getText().toString();
                String pwd = password.getText().toString();
                String cpwd = cpassword.getText().toString();

                if(email.isEmpty()){
                    emailId.setError("Please Enter Valid Email");
                    emailId.requestFocus();
                }
                else if (pwd.isEmpty()){
                    password.setError("Please Enter Password");
                    password.requestFocus();
                }

                /*else if (!(pwd == cpwd)){
                    cpassword.setError("Password not macthed");
                    cpassword.requestFocus();
                }*/


                else if (email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(Register.this,"Fields are Empty!",Toast.LENGTH_SHORT).show();
                }
                else if(!(email.isEmpty() && pwd.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(Register.this,"Signup Unsuccessful.Please Try Again",Toast.LENGTH_SHORT).show();
                            }
                            else{
                                startActivity(new Intent(Register.this,Login.class));
                            }
                        }
                    });
                }

                else {
                    Toast.makeText(Register.this,"Error Occurred!",Toast.LENGTH_SHORT).show();
                }

            }
        });






        al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register.this,Login.class);
                startActivity(i);
            }
        });
    }
}