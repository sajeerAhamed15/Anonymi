package com.anonymi.anonymi.Tabs;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.anonymi.anonymi.Fragments.Chat.ChatActivity;
import com.anonymi.anonymi.Fragments.MainActivity;
import com.anonymi.anonymi.R;
import com.anonymi.anonymi.Tabs.Adaptors.chatAdapter;


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
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        return rootView;

    }

}
