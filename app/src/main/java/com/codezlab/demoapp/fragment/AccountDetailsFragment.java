package com.codezlab.demoapp.fragment;

import android.app.Fragment;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codezlab.demoapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AccountDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AccountDetailsFragment extends Fragment {

    public AccountDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment AccountDetailsFragment.
     */
    public static AccountDetailsFragment newInstance() {
        AccountDetailsFragment fragment = new AccountDetailsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account_details, container, false);
    }
}