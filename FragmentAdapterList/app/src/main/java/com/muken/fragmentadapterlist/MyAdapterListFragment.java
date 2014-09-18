package com.muken.fragmentadapterlist;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by muken on 18/09/14.
 */
public class MyAdapterListFragment extends Fragment {

    private ListView lista;

    String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
            "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
            "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
            "Android", "iPhone", "WindowsMobile" };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState){
        View viewHierarchy =
                inflater.inflate(R.layout.fragment_adapter_list,
                        container, false);

        return viewHierarchy;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        ArrayList<String> listaValores  = new ArrayList<String>();
        listaValores.addAll( Arrays.asList(values) );

        lista = (ListView) getActivity().findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity().getBaseContext(),
                android.R.layout.simple_list_item_1 ,
                listaValores);
        lista.setAdapter(adapter);
    }


}
