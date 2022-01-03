package com.java.cvmaker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    ArrayList<Resume> list = new ArrayList<>();

    public RVAdapter(Context context){
        this.context=context;
    }
    public void setItems(ArrayList<Resume> resume){
        list.addAll(resume);
    }
    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tempcv1,parent,false);
        return new ResumeVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {

        ResumeVH vh = (ResumeVH) holder;
        Resume resume = list.get(position);
        vh.pnames.setText(resume.getPname());
        vh.paddresss.setText(resume.getPaddress());
        vh.pemails.setText(resume.getPemail());
        vh.pphones.setText(resume.getPphone());
        vh.pwebsites.setText(resume.getPwebsite());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
