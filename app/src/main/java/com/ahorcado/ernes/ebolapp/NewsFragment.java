package com.ahorcado.ernes.ebolapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    private ListView itemsListView;

    private List<Concert> listConcerts;
    private Adapter adapter;

    public NewsFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_news, container, false);

        itemsListView = (ListView) fragmentView.findViewById(R.id.items_list_view);
        listConcerts = new ArrayList<>();

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Concerts");
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> concertList, ParseException e) {
                if (e == null) {
                    Log.d("score", "Retrieved " + concertList.size() + " scores");

                    for (ParseObject parseObject : concertList) {
                        String title = (String) parseObject.get("title");
                        String link = (String) parseObject.get("link");
                        String imageLink = (String) parseObject.get("imageLink");
                        Concert concert = new Concert(title, link, imageLink);
                        listConcerts.add(concert);
                    }

                    adapter = new Adapter(listConcerts, getActivity(), getContext());
                    itemsListView.setAdapter(adapter);

                } else {
                    Log.d("score", "Error: " + e.getMessage());
                }
            }
        });

        return fragmentView;
    }

}
