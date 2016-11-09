package com.example.cszsombi.android_2016_09_22;

import android.content.Intent;
import android.test.suitebuilder.TestMethod;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.TextView;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

import com.data.DSymbol;

import com.data.DSymbol;

import java.text.DecimalFormat;
import  java.util.ArrayList;
import java.util.List;

/**
 * Created by donat on 2016. 11. 09..
 */
public class SymbolAdapter extends ArrayAdapter<DSymbol>{

    public interface SymbolAdapterListener{
        void showClubId(int symbolId); // nem biztos

    }

    private SymbolAdapterListener mSymbolAdapterListener;


    private ArrayList<View> mViews;
    public SymbolAdapter(SymbolAdapterListener listener, context, int resource, List<DSymbol> objects) {
        super(context, resource, objects);
        mSymbolAdapterListener=listener;
        mViews=new ArrayList<View>();
        for (int i=0; i<objects.size(); i++){
            mView.add(null);
        }
    }

@ Override
    public View getView(int position, View convertView, ViewGroup parent){
    if(mViews.get(position==null){
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View view=inflater.inflate(android.R.layout.activity_list_item, parent); //activity eltér

        TextView title=(TextView) view.findViewById(R.id.main_listem_lastvalue); //vmi nem stimmel
        title.setText(getItem(position).getCode());

        TextView lastvalue=(TextView) view.findViewById(R.id.main_listem_lastvalue); // vmi nem stimmel
        DecimalFormat df=new DecimalFormat("0.00##");
        lastvalue.setText(df.format(getItem(position).getLastValue())); // vmi

        Button show=(Button).view.findViewById(R.id.main_listitem_show);
        show.setTag(((Integer)position));
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSymbolAdapterListener.showClubId(); // nem fejeztem be
            }
        });
                                }
        Button delete=(Button).view.findViewById(R.id.main_listitem_delete); //wet
            delete.setTag(((Integer)position));
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 mSymbolAdapterListener.delete; // nem fejeztem be
        }
    });
        mViews.set(position, view);
    }
    return mViews.get(position);
}
}
