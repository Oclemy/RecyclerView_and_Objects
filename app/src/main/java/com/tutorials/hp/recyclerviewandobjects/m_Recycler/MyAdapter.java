package com.tutorials.hp.recyclerviewandobjects.m_Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.recyclerviewandobjects.Person;
import com.tutorials.hp.recyclerviewandobjects.R;

import java.util.ArrayList;

/**
 * Created by Oclemy on 7/6/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    ArrayList<Person> people;

    public MyAdapter(Context c, ArrayList<Person> people) {
        this.c = c;
        this.people = people;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        //BIND DATA
        holder.nameTxt.setText(people.get(position).getName());
        holder.countryTxt.setText(people.get(position).getCountry());


    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
