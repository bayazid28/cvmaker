package com.java.cvmaker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class Home extends AppCompatActivity {
    ViewFlipper flipper;
    Button crbtn,dd,te,fq;
    FirebaseAuth mFirebaseAuth;
    private  FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        //getSupportActionBar().hide();
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.www);

        getSupportActionBar().setTitle("CV Maker");
        getSupportActionBar().setSubtitle("A resume none can Reject");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));
        getSupportActionBar().setSubtitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_tname) + "</font>"));
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.acbar)));
        int[] imgarray = {R.drawable.s1,R.drawable.s2,R.drawable.s3};
        flipper = findViewById(R.id.flipper);
        crbtn = findViewById(R.id.crbtn);
        dd = findViewById(R.id.dd);
        te = findViewById(R.id.te);
        fq = findViewById(R.id.fq);
        //Button logout = findViewById(R.id.logoutbtn);
        /*logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(Home.this,Login.class);
                startActivity(i);
            }
        });*/


        crbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,Cv.class);
                startActivity(i);
            }
        });
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,Download.class);
                startActivity(i);
            }
        });
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,ShowTemplate.class);
                startActivity(i);
            }
        });
        fq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,FAQScreen.class);
                startActivity(i);
            }
        });

        for(int i = 0;i<imgarray.length;i++){
            showimage(imgarray[i]);
        }


    }
    public void showimage(int img){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(4000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.layout_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.logoutbtn){
            FirebaseAuth.getInstance().signOut();
            Intent i = new Intent(Home.this,Login.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}