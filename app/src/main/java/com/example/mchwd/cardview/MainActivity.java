package com.example.mchwd.cardview;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction tx;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button)findViewById(R.id.click);
        fm = getSupportFragmentManager();
        click.setVisibility(View.VISIBLE);
       /* tx = fm.beginTransaction();
        tx.add(R.id.fragment,new Cards());
        tx.commit();*/

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx = fm.beginTransaction();
                tx.replace(R.id.fragment,new Cards());
                tx.commit();
                click.setVisibility(View.GONE);

            }
        });

    }
}
