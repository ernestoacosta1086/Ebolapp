package com.ahorcado.ernes.ebolapp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ernes on 6/29/2016.
 */
public class Adapter extends BaseAdapter {
    private List<Concert> list;
    private Activity activity;
    Context context;


    public Adapter(List<Concert> list, Activity activity, Context context) {
        this.list = list;
        this.activity = activity;
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = activity.getLayoutInflater().inflate(R.layout.row, null);

        TextView titleTextView = (TextView) rowView.findViewById(R.id.title_textView);
        titleTextView.setText(list.get(position).getTitle());

        TextView imageTextView = (TextView) rowView.findViewById(R.id.image_textView);
        imageTextView.setText(list.get(position).getLink());

        ImageView imageLinkTextView = (ImageView) rowView.findViewById(R.id.image_link_textView);
        Picasso.with(activity)
                .load(list.get(position).getImageLink())
                .into(imageLinkTextView);

        return rowView;
    }
}
