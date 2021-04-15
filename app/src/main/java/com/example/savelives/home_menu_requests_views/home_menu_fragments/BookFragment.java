package com.example.savelives.home_menu_requests_views.home_menu_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savelives.R;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class BookFragment extends Fragment {

    ChipNavigationBar homeNavBar;

    public BookFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_book, container, false);
        return view;
    }


}