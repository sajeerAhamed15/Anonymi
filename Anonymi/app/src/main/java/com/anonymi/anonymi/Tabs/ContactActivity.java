package com.anonymi.anonymi.Tabs;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import com.anonymi.anonymi.ContactModel;
import com.anonymi.anonymi.CustomAdaptor;
import com.anonymi.anonymi.R;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {
    private ListView listView;
    private CustomAdaptor customAdapter;
    private ArrayList<ContactModel> contactModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        listView = (ListView) findViewById(R.id.listView);
        contactModelArrayList = new ArrayList<>();

        Cursor phones = getApplicationContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null,null, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME+" ASC");
        while (phones.moveToNext())
        {
            String name=phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

            ContactModel contactModel = new ContactModel();
            contactModel.setName(name);
            contactModel.setNumber(phoneNumber);
            contactModelArrayList.add(contactModel);
        }
        phones.close();

        customAdapter = new CustomAdaptor(getApplicationContext(),contactModelArrayList);
        listView.setAdapter(customAdapter);
    }
}
