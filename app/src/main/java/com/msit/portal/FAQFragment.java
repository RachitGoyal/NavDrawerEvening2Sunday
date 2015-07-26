package com.msit.portal;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FAQFragment extends Fragment {

    public FAQFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView = inflater.inflate(R.layout.fragment_faq, container, false);
        ExpandableListAdapter listAdapter;
        ExpandableListView expListView;
        List<String> listDataHeader;
        HashMap<String, List<String>> listDataChild;

        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

     //   listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
     //   expListView.setAdapter(listAdapter);

        return rootView;
    }

    private void prepareListData() {
    //    listDataHeader = new ArrayList<String>();
    //    listDataChild = new HashMap<String, List<String>>();

        // Adding child data
     //   listDataHeader.add("Why do i need MSIT-PORTAL apk");
     //   listDataHeader.add("Who can use this website ");
       /* listDataHeader.add("Coming Soon..");*/

        // Adding child data
        List<String> ques1 = new ArrayList<String>();
        ques1.add("MSIT-Portal would like you to provide the power of  MSIT website with addon functionality. \n" +
                        "\n" +
                        "You will be mesmerized by the minimalistic layout of this apk with functionalities you woud have never seen. \n"
        );

        List<String> ques2 = new ArrayList<String>();
        ques2.add("Anyone can use this website");
        ques2.add("Whether you are a :\n" + "1.Parent \n" + "2.Student\n" + "3.Teacher\n" + "4.Visitor\n");



    //    listDataChild.put(listDataHeader.get(0), ques1); // Header, Child data
    //    listDataChild.put(listDataHeader.get(1), ques2);



    }

}
