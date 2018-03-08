package com.axel.app1.fragments;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declaramos el fragment creado
        ListFragmente a = new ListFragmente();
        // Declaramos el manager que pasara la transacción de dicho fragment
        FragmentManager b = getFragmentManager();
        //Hacemos la transaccion que hara que muestre nuestro fragment
        //Debemos pasarle el id de donde se mostrara el fragment, el fragment y hacemos un commit
        b.beginTransaction().add(R.id.pantallaentera,a, " ").commit();

    }

    //Para que un fragment pueda remplazar a otro es a traves de un metodo
    public void cambioFragment(Bundle bundle){
        ListFragmentDos c = new ListFragmentDos();
        c.setBundle(bundle);
        FragmentManager d = getFragmentManager();

        // En este caso utilizamo el replace para que quite el fragment que hay por el indicado
        d.beginTransaction().replace(R.id.pantallaentera,c).addToBackStack(null).commit();

//                replace add remove importantes de transaction
    }
}
