package com.java.cvmaker;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ResumeVH extends RecyclerView.ViewHolder {

    public TextView pnames,paddresss,pemails,pphones,pwebsites;
    public ResumeVH(@NonNull @NotNull View itemView) {
        super(itemView);
        pnames=itemView.findViewById(R.id.name);
        paddresss=itemView.findViewById(R.id.address);
        pemails=itemView.findViewById(R.id.email);
        pphones=itemView.findViewById(R.id.mobileno);
        pwebsites=itemView.findViewById(R.id.website);
    }
}
