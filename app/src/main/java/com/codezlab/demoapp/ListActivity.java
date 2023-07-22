package com.codezlab.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private List<String> studentList;

    private RecyclerView studentRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        studentList =new ArrayList<>();
        studentList.add("Gurvinder Singh");
        studentList.add("Satvinder Singh");
        studentList.add("Akash Verma");
        studentList.add("Kajal");
        studentList.add("Sonu Singh");
        studentList.add("Amit Kumar Verma");
        studentList.add("Alex");
        studentList.add("Manpreet Singh Maan");

        studentRv = findViewById(R.id.student_rv);
        LinearLayoutManager llm =new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);

        studentRv.setLayoutManager(llm);


        StudentListAdapter mAdapter=new StudentListAdapter(studentList);
        studentRv.setAdapter(mAdapter);

    }


}