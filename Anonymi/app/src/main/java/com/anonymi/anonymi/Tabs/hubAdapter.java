package com.anonymi.anonymi.Tabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.anonymi.anonymi.R;


public class hubAdapter extends BaseAdapter {
    String[] namee;
    String[] details;
    String[] tags;
    Context context;
    private static LayoutInflater inflater=null;
    public hubAdapter(Context mainActivity, String[] name, String[] status,String[] tagss) {
        // TODO Auto-generated constructor stub
        namee =name;
        details =status;
        tags = tagss;
        context=mainActivity;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return namee.length;
    }
    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        TextView stv;
        TextView tag;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.anohub_single_view, null);
        holder.tv=(TextView) rowView.findViewById(R.id.name);
        holder.stv=(TextView) rowView.findViewById(R.id.number);
        holder.tag= (TextView)rowView.findViewById(R.id.tag) ;

        holder.tv.setText(namee[position]);
        holder.stv.setText(details[position]);
        holder.tag.setText(tags[position]);
        return rowView;
    }

}
