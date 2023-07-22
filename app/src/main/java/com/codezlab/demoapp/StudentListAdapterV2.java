package com.codezlab.demoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentListAdapterV2 extends RecyclerView.Adapter<StudentListAdapterV2.StudentViewHolder> {

    private List<Student> list;

    public StudentListAdapterV2(List<Student> list){
        this.list = list;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.name_layout_single_card_v2,parent,false);
        StudentViewHolder sv=new StudentViewHolder(v);
        return sv;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

       Student student = list.get(position);
       holder.nameTV.setText(student.getName());
       holder.ageTV.setText(String.valueOf(student.getAge()));
       holder.streamTV.setText(student.getStream());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder{

        private TextView nameTV;
        private TextView ageTV;
        private TextView streamTV;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            this.nameTV = itemView.findViewById(R.id.nameTV);
            this.ageTV = itemView.findViewById(R.id.ageTV);
            this.streamTV = itemView.findViewById(R.id.streamTV);
        }
    }

}
