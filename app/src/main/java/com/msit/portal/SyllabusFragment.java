package com.msit.portal;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SyllabusFragment extends Fragment {

    public SyllabusFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_syllabus, container, false);
        TextView cse= (TextView) rootView.findViewById(R.id.cse);
        TextView ece= (TextView) rootView.findViewById(R.id.ece);
        TextView it= (TextView) rootView.findViewById(R.id.it);
        TextView eee= (TextView) rootView.findViewById(R.id.eee);
        cse.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent cseIntent= new Intent(getActivity(), SemesterActivity.class);
                startActivity(cseIntent);
                return false;


            }
        });
        ece.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent eceIntent= new Intent(getActivity(), SemesterActivity.class);
                startActivity(eceIntent);
                return false;

            }
        });
        it.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent itIntent = new Intent(getActivity(), SemesterActivity.class);
                startActivity(itIntent);
                return false;

            }
        });
        eee.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent eeeIntent = new Intent(getActivity(), SemesterActivity.class);
                startActivity(eeeIntent);
                return false;

            }
        });

        return rootView;
    }

}
