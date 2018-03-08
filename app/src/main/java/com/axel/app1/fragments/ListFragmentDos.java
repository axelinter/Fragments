package com.axel.app1.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragmentDos extends Fragment {
    Bundle bundlee;
TextView textfag;
    public ListFragmentDos() {
        // Required empty public constructor
    }
public void setBundle(Bundle bundle){
        bundlee = bundle;
}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list_fragment_dos, container, false);
        textfag = (TextView) v.findViewById(R.id.textfag);
        if (bundlee != null){
    textfag.setText(bundlee.getString("nombre"));

}


        return v;
    }

}
