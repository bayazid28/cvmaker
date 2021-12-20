package com.java.cvmaker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Resume> resumeArrayList;

    public MyAdapter(Context context, ArrayList<Resume> resumeArrayList) {
        this.context = context;
        this.resumeArrayList = resumeArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.tempcv1,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull  MyAdapter.MyViewHolder holder, int position) {
        Resume resume = resumeArrayList.get(position);

        holder.Name.setText(resume.getName());

        holder.Address.setText(resume.getAddress());
        holder.Phone.setText(resume.getPhone());
        holder.Email.setText(resume.getEmail());
        holder.Website.setText(resume.getWebsite());

        holder.Objective.setText(resume.getObjective());

        holder.Course1.setText(resume.getCourse1());
        holder.Versity1.setText(resume.getVersity1());
        holder.Grade1.setText(resume.getGrade1());
        holder.Year1.setText(resume.getYear1());

        holder.Course2.setText(resume.getCourse2());
        holder.Versity2.setText(resume.getVersity2());
        holder.Grade2.setText(resume.getGrade2());
        holder.Year2.setText(resume.getYear2());

        holder.Course3.setText(resume.getCourse3());
        holder.Versity3.setText(resume.getVersity3());
        holder.Grade3.setText(resume.getGrade3());
        holder.Year3.setText(resume.getYear3());

        holder.Course4.setText(resume.getCourse4());
        holder.Versity4.setText(resume.getVersity4());
        holder.Grade4.setText(resume.getGrade4());
        holder.Year4.setText(resume.getYear4());

        holder.Skillname1.setText(resume.getSkillname1());
        holder.Skilldes1.setText(resume.getSkilldes1());

        holder.Skillname2.setText(resume.getSkillname2());
        holder.Skilldes2.setText(resume.getSkilldes2());

        holder.Skillname3.setText(resume.getSkillname3());
        holder.Skilldes3.setText(resume.getSkilldes3());

        holder.Skillname4.setText(resume.getSkillname4());
        holder.Skilldes4.setText(resume.getSkilldes4());

        holder.projectname1.setText(resume.getProjectname1());
        holder.projectdes1.setText(resume.getProjectdes1());

        holder.projectname2.setText(resume.getProjectname2());
        holder.projectdes2.setText(resume.getProjectdes2());

        holder.projectname3.setText(resume.getProjectname3());
        holder.projectdes3.setText(resume.getProjectdes3());

        holder.language1.setText(resume.getLanguage1());
        holder.language2.setText(resume.getLanguage2());
        holder.language3.setText(resume.getLanguage3());

        holder.Companyname1.setText(resume.getCompanyname1());
        holder.jobtitle1.setText(resume.getJobtitle1());
        holder.startdate1.setText(resume.getStartdate1());
        holder.enddate1.setText(resume.getEnddate1());
        holder.jobdetail1.setText(resume.getJobdetail1());

        holder.Companyname2.setText(resume.getCompanyname2());
        holder.jobtitle2.setText(resume.getJobtitle2());
        holder.startdate2.setText(resume.getStartdate2());
        holder.enddate2.setText(resume.getEnddate2());
        holder.jobdetail2.setText(resume.getJobdetail2());

        holder.Companyname3.setText(resume.getCompanyname3());
        holder.jobtitle3.setText(resume.getJobtitle3());
        holder.startdate3.setText(resume.getStartdate3());
        holder.enddate3.setText(resume.getEnddate3());
        holder.jobdetail3.setText(resume.getJobdetail3());

        holder.Companyname4.setText(resume.getCompanyname4());
        holder.jobtitle4.setText(resume.getJobtitle4());
        holder.startdate4.setText(resume.getStartdate4());
        holder.enddate4.setText(resume.getEnddate4());
        holder.jobdetail4.setText(resume.getJobdetail4());


    }

    @Override
    public int getItemCount() {
        return resumeArrayList.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{


        TextView Name;
        TextView Address,Phone,Email,Website,Objective;

        TextView Course1,Versity1,Grade1,Year1;
        TextView Course2,Versity2,Grade2,Year2;
        TextView Course3,Versity3,Grade3,Year3;
        TextView Course4,Versity4,Grade4,Year4;

        TextView Skillname1,Skilldes1;
        TextView Skillname2,Skilldes2;
        TextView Skillname3,Skilldes3;
        TextView Skillname4,Skilldes4;

        TextView projectname1,projectdes1;
        TextView projectname2,projectdes2;
        TextView projectname3,projectdes3;

        TextView language1,language2,language3;

        TextView Companyname1,jobtitle1,startdate1,enddate1,jobdetail1;
        TextView Companyname2,jobtitle2,startdate2,enddate2,jobdetail2;
        TextView Companyname3,jobtitle3,startdate3,enddate3,jobdetail3;
        TextView Companyname4,jobtitle4,startdate4,enddate4,jobdetail4;

        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.name);
            Address = itemView.findViewById(R.id.address);
            Phone = itemView.findViewById(R.id.pphone);
            Email = itemView.findViewById(R.id.email);
            Website = itemView.findViewById(R.id.website);
            Objective = itemView.findViewById(R.id.objective);

            Course1=itemView.findViewById(R.id.coursename1);
            Versity1=itemView.findViewById(R.id.versityname1);
            Grade1=itemView.findViewById(R.id.grade1);
            Year1=itemView.findViewById(R.id.year1);

            Course2=itemView.findViewById(R.id.coursename2);
            Versity2=itemView.findViewById(R.id.versityname2);
            Grade2=itemView.findViewById(R.id.grade2);
            Year2=itemView.findViewById(R.id.year2);

            Course3=itemView.findViewById(R.id.coursename3);
            Versity3=itemView.findViewById(R.id.versityname3);
            Grade3=itemView.findViewById(R.id.grade3);
            Year3=itemView.findViewById(R.id.year3);

            Course4=itemView.findViewById(R.id.coursename4);
            Versity4=itemView.findViewById(R.id.versityname4);
            Grade4=itemView.findViewById(R.id.grade4);
            Year4=itemView.findViewById(R.id.year4);

            Skillname1=itemView.findViewById(R.id.skillname1);
            Skilldes1=itemView.findViewById(R.id.skilldes1);

            Skillname2=itemView.findViewById(R.id.skillname2);
            Skilldes2=itemView.findViewById(R.id.skilldes2);

            Skillname3=itemView.findViewById(R.id.skillname3);
            Skilldes3=itemView.findViewById(R.id.skilldes3);

            Skillname4=itemView.findViewById(R.id.skillname4);
            Skilldes4=itemView.findViewById(R.id.skilldes4);

            projectname1 = itemView.findViewById(R.id.projectname1);
            projectdes1 = itemView.findViewById(R.id.projectdes1);

            projectname2 = itemView.findViewById(R.id.projectname2);
            projectdes2 = itemView.findViewById(R.id.projectdes2);

            projectname3 = itemView.findViewById(R.id.projectname3);
            projectdes3 = itemView.findViewById(R.id.projectdes3);

            language1 = itemView.findViewById(R.id.lng1);
            language2 = itemView.findViewById(R.id.lng2);
            language3 = itemView.findViewById(R.id.lng3);

            Companyname1 = itemView.findViewById(R.id.companyname1);
            jobtitle1 = itemView.findViewById(R.id.jobtitle1);
            startdate1 = itemView.findViewById(R.id.sdate1);
            enddate1 = itemView.findViewById(R.id.edate1);
            jobdetail1 = itemView.findViewById(R.id.jobdetail1);

            Companyname2 = itemView.findViewById(R.id.companyname2);
            jobtitle2 = itemView.findViewById(R.id.jobtitle2);
            startdate2 = itemView.findViewById(R.id.sdate2);
            enddate2 = itemView.findViewById(R.id.edate2);
            jobdetail2 = itemView.findViewById(R.id.jobdetail2);

            Companyname3 = itemView.findViewById(R.id.companyname3);
            jobtitle3 = itemView.findViewById(R.id.jobtitle3);
            startdate3 = itemView.findViewById(R.id.sdate3);
            enddate3 = itemView.findViewById(R.id.edate3);
            jobdetail3 = itemView.findViewById(R.id.jobdetail3);

            Companyname4 = itemView.findViewById(R.id.companyname4);
            jobtitle4 = itemView.findViewById(R.id.jobtitle4);
            startdate4 = itemView.findViewById(R.id.sdate4);
            enddate4 = itemView.findViewById(R.id.edate4);
            jobdetail4 = itemView.findViewById(R.id.jobdetail4);


        }
    }
}
