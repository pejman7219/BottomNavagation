package com.example.pejman.bottomnavagation.Frogments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pejman.bottomnavagation.R;

public class TowFragment extends Fragment {
    public TowFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tow,container,false);
        return view;
    }
}
