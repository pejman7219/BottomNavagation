package com.example.pejman.bottomnavagation.Frogments;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pejman.bottomnavagation.R;



public class FureFragment extends Fragment {

    public FureFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fure,container,false);
        return view;
    }
}
