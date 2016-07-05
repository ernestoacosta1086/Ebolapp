package Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ahorcado.ernes.ebolapp.Concert;
import com.ahorcado.ernes.ebolapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ernes on 6/29/2016.
 */
public class ListViewAdapter extends BaseAdapter {
    private List<Concert> list;
    private Activity activity;


    public ListViewAdapter(List<Concert> list, Activity activity) {
        this.list = list;
        this.activity = activity;
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
