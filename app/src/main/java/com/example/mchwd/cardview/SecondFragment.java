package com.example.mchwd.cardview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    /*
    * this is */
    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        Button button = (Button)view.findViewById(R.id.secondfragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* tx = fm.beginTransaction();
                tx.replace(R.id.secondfragment,new SecondFragment());
                tx.commit();*/
                Toast.makeText(getContext(),"Im last page",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
