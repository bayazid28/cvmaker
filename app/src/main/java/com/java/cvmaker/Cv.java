package com.java.cvmaker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Cv extends AppCompatActivity {
    Button msbtn,pdbtn,edbtn,exbtn,skbtn,obtn,rfbtn,ptbtn,lnbtn,ibtn,abtn,asbtn,psbtns,cgbl,vcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
        getSupportActionBar().setTitle("My Resume");
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_mname) + "</font>"));
        msbtn = findViewById(R.id.msbtn);
        pdbtn = findViewById(R.id.pdbtn);
        edbtn = findViewById(R.id.edbtn);
        exbtn = findViewById(R.id.exbtn);
        skbtn = findViewById(R.id.skbtn);
        obtn = findViewById(R.id.obtn);
        rfbtn = findViewById(R.id.rfbtn);
        ptbtn = findViewById(R.id.ptbtn);
        lnbtn = findViewById(R.id.lnbtn);
        ibtn = findViewById(R.id.ibtn);
        abtn = findViewById(R.id.abtn);
        asbtn = findViewById(R.id.asbtn);
        psbtns = findViewById(R.id.psbtns);
        cgbl = findViewById(R.id.cgbl);
        vcv = findViewById(R.id.vcv);

        //exbtn.setEnabled(false);
        //exbtn.setBackgroundColor(getResources().getColor(R.color.abtnc));

        msbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String arr[]={"None","Experience","Reference","Project","Language","Interest","Acheivement","Activities","Publication","Signature"};

                AlertDialog.Builder builder = new AlertDialog.Builder(Cv.this);
                builder.setTitle("Manage Sections");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.setSingleChoiceItems(arr, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        if (arr[which] == "Experience") {
                               
                            exbtn.setEnabled(true);
                            exbtn.setBackgroundColor(getResources().getColor(R.color.btnc));
                            }
                        else if (arr[which] == "Reference") {
                            rfbtn.setEnabled(true);
                            rfbtn.setBackgroundColor(getResources().getColor(R.color.btnc));
                        }
                        else  if (arr[which] == "Project") {
                            ptbtn.setEnabled(true);
                            ptbtn.setBackgroundColor(getResources().getColor(R.color.btnc));
                        }
                        else  if (arr[which] == "Language") {
                            lnbtn.setEnabled(true);
                            lnbtn.setBackgroundColor(getResources().getColor(R.color.btnc));
                        }
                        else  if (arr[which] == "Interest") {
                            ibtn.setEnabled(true);
                            ibtn.setBackgroundColor(getResources().getColor(R.color.btnc));
                        }
                        else  if (arr[which] == "Acheivement") {
                            abtn.setEnabled(true);
                            abtn.setBackgroundColor(getResources().getColor(R.color.btnc));
                        }
                        else  if (arr[which] == "Activities") {
                            asbtn.setEnabled(true);
                            asbtn.setBackgroundColor(getResources().getColor(R.color.btnc));
                        }
                       else if (arr[which] == "Publication") {
                            psbtns.setEnabled(true);
                            psbtns.setBackgroundColor(getResources().getColor(R.color.btnc));
                        }
                        else if (arr[which] == "Signature") {
                            cgbl.setEnabled(true);
                            cgbl.setBackgroundColor(getResources().getColor(R.color.btnc));
                        }
                        }

                });
                /*builder.setMultiChoiceItems(arr, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {


                    }
                }); */
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });





        pdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Personal.class);
                startActivity(i);
            }
        });
        edbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Education.class);
                startActivity(i);
            }
        });
        exbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Experience.class);
                startActivity(i);
            }
        });
        skbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,skill.class);
                startActivity(i);
            }
        });
        obtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Objective.class);
                startActivity(i);
            }
        });
        rfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Reference.class);
                startActivity(i);
            }
        });
        ptbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Project.class);
                startActivity(i);
            }
        });
        lnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Language.class);
                startActivity(i);
            }
        });
        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Interest.class);
                startActivity(i);
            }
        });
        abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Acheivement.class);
                startActivity(i);
            }
        });
        asbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Activities.class);
                startActivity(i);
            }
        });
        psbtns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Publication.class);
                startActivity(i);
            }
        });
        cgbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Signature.class);
                startActivity(i);
            }
        });
        vcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,ChooseTemplate.class);
                startActivity(i);
            }
        });
    }
}