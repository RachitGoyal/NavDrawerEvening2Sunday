package com.msit.portal;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ReminderFragment extends Fragment {

    public ReminderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_reminder, container, false);
        final Button next = (Button) rootView.findViewById(R.id.next);
        final EditText date = (EditText) rootView.findViewById(R.id.date);
        final EditText title = (EditText) rootView.findViewById(R.id.title);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stickyIntent = new Intent(getActivity(), Sticky_ReminderActivity.class);
                stickyIntent.putExtra("date", date.getText().toString());
                stickyIntent.putExtra("title", title.getText().toString());

                startActivity(stickyIntent);
            }

        });
        return rootView;
    }

}
