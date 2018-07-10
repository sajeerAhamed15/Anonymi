package com.anonymi.anonymi.Tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.anonymi.anonymi.R;


public class AnoChatsTab extends Fragment {

    ListView lv;

    public static String [] name = {"Anon 1","Anon 2","Anon 3","Anon 4","Anon 5"} ;
    public static String [] msg = {"YO!","DUCK","Buhahhaa","LOL","ASSS"};
    public static String [] tags = {"Fun","tag","Tag","Dogs","Chicks"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_tab2, container, false);



        lv=(ListView) rootView.findViewById(R.id.listView);
        lv.setAdapter(new chatAdapter(this.getActivity(), name, msg,tags));


        return rootView;

    }

}
