package com.example.pankaj.fragmentrecyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Pankaj on 17-01-2018.
 */

public class ListFragment extends android.app.Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_list,container,false);

            RecyclerView recyclerView = view.findViewById(R.id.listRecyclerView);
            MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter();
            recyclerView.setAdapter(myRecyclerAdapter);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(layoutManager);

            return view;
    }
}

