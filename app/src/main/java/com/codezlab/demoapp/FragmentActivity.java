package com.codezlab.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;

import com.codezlab.demoapp.fragment.AccountDetailsFragment;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        AccountDetailsFragment detailsFragment= AccountDetailsFragment.newInstance();

       FragmentManager fragmentManager= getFragmentManager();

       fragmentManager.beginTransaction().replace(R.id.fragmentContainer,detailsFragment,AccountDetailsFragment.class.getSimpleName()).commit();


    }
}