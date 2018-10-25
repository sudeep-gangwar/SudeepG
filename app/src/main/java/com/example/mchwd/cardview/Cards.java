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
public class Cards extends Fragment {

    FragmentTransaction tx;
    FragmentManager fm;

    public Cards() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_cards,container,false);
        final Button button = (Button)view.findViewById(R.id.infragment);

        fm=getFragmentManager();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tx = fm.beginTransaction();
                tx.replace(R.id.cardsfragment,new SecondFragment());
                tx.commit();
                button.setVisibility(View.GONE);
                Toast.makeText(getActivity(),"Go to LastPage",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
