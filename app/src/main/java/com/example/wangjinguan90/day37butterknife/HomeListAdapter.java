package com.example.wangjinguan90.day37butterknife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by wangjinguan90 on 2016/11/1.
 */
public class HomeListAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;

    public HomeListAdapter(Context context) {
        this.context = context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       if(convertView!=null){
          // convertView=inflater.inflate(R.lay)
       }
        return null;
    }
}
