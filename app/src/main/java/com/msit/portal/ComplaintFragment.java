package com.msit.portal;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class ComplaintFragment extends Fragment {

    public ComplaintFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_complaint, container, false);
        final Button next = (Button) rootView.findViewById(R.id.next);
        final EditText name = (EditText) rootView.findViewById(R.id.name);
        final EditText branch = (EditText) rootView.findViewById(R.id.branch);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stickyIntent = new Intent(getActivity(), StickyNotesActivity.class);
                stickyIntent.putExtra("name", name.getText().toString());
                stickyIntent.putExtra("branch", branch.getText().toString());
                    startActivity(stickyIntent);
            }

        });
        return rootView;
    }

}
