package com.tutorials.hp.recyclerviewandobjects;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.tutorials.hp.recyclerviewandobjects.m_Recycler.MyAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Person> people=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RECYCLERVIEW
        RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //FILL LIST
        fillPeople();

        //ADAPTER
        MyAdapter adapter=new MyAdapter(this,people);
        rv.setAdapter(adapter);

    }

    private void fillPeople()
    {
        people.clear();

        Person p=new Person();
        p.setName("Micky");
        p.setCountry("Armenia");
        people.add(p);

        p=new Person();
        p.setName("Nemanja");
        p.setCountry("Serbia");
        people.add(p);

        p=new Person();
        p.setName("Lucy");
        p.setCountry("Russia");
        people.add(p);

        p=new Person();
        p.setName("Rebecca");
        p.setCountry("South Africa");
        people.add(p);

        p=new Person();
        p.setName("Singh");
        p.setCountry("India");
        people.add(p);

        p=new Person();
        p.setName("Kurt");
        p.setCountry("France");
        people.add(p);

        p=new Person();
        p.setName("Vicente");
        p.setCountry("Spain");
        people.add(p);
    }
}
