package com.axel.app1.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragmente extends Fragment implements AdapterView.OnItemClickListener {

ListView lista;
    public ListFragmente() {
        // Required empty public constructor
    }
public String[] listasitems ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_list_fragmente, container, false);
        lista = v.findViewById(R.id.list);
        listasitems =  getResources().getStringArray(R.array.listasitems);
        ArrayAdapter<String> listaitems = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, listasitems);

        lista.setAdapter(listaitems);
        lista.setOnItemClickListener(this);
        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        MainActivity mainActivity = (MainActivity)getActivity();

        Bundle bundle = new Bundle();
        bundle.putString("nombre",listasitems[position]);
        mainActivity.cambioFragment(bundle);

    }
}
