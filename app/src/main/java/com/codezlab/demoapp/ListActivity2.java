package com.codezlab.demoapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity2 extends AppCompatActivity {

    private List<Student> studentList;

    private RecyclerView studentRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        studentList =new ArrayList<>();
        studentList.add(new Student("Gurvinder Singh", 18,"Arts"));
        studentList.add(new Student("Satvinder Singh", 30,"Commerce"));
        studentList.add(new Student("Akash Verma", 23,"Science"));
        studentList.add(new Student("Kajal", 18,"Arts"));
        studentList.add(new Student("Sonu Singh", 24,"Commerce"));
        studentList.add(new Student("Amit Kumar Verma", 19,"Home Science"));
        studentList.add(new Student("Alex", 18,"Arts"));
        studentList.add(new Student("Manpreet Singh Maan", 22,"Business"));

        studentRv = findViewById(R.id.student_rv);
        LinearLayoutManager llm =new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);

        studentRv.setLayoutManager(llm);


        StudentListAdapterV2 mAdapter=new StudentListAdapterV2(studentList);
        studentRv.setAdapter(mAdapter);

    }


}