package com.chanpyaeaung.local.experiences.presentation.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chanpyaeaung.local.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExperienceListFragment extends Fragment {


    public ExperienceListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_experience_list, container, false);
    }

}
