package com.codezlab.demoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.StudentViewHolder> {

    private List<String> list;

    public StudentListAdapter(List<String> list){
        this.list = list;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.name_layout_single_card,parent,false);
        StudentViewHolder sv=new StudentViewHolder(v);
        return sv;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

       String studentName = list.get(position);
       holder.nameTV.setText(studentName);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder{

        private TextView nameTV;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            this.nameTV = itemView.findViewById(R.id.nameTV);
        }
    }

}
