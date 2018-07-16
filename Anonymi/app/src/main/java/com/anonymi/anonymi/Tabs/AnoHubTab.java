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

import com.anonymi.anonymi.Fragments.Chat.ChatActivity;
import com.anonymi.anonymi.R;
import com.anonymi.anonymi.Tabs.Adaptors.hubAdapter;


public class AnoHubTab extends Fragment {

    ListView lv;

    public static String [] name = {"Anon 1","Anon 2","Anon 3","Anon 4","Anon 5"} ;
    public static String [] msg = {"Ihave a problem with my asshole","Inzimam in hemmatagama is so bad","Do you also hate walking?","LoL I LOST MY VIRGINITY","ASSSes in kandy are good"};
    public static String [] tags = {"Fun","tag","Tag","Dogs","Chicks"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_tab3, container, false);



        lv=(ListView) rootView.findViewById(R.id.listView);
        lv.setAdapter(new hubAdapter(this.getActivity(), name, msg,tags));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                alertDialogBuilder.setMessage("Do you want to start a chat?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                startActivity(new Intent(getActivity(), ChatActivity.class));
                            }
                        });

                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });


        return rootView;

    }

}
