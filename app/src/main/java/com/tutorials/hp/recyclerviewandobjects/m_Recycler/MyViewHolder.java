package com.tutorials.hp.recyclerviewandobjects.m_Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.recyclerviewandobjects.R;


/**
 * Created by Oclemy on 7/6/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView nameTxt,countryTxt;


    public MyViewHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        countryTxt= (TextView) itemView.findViewById(R.id.countryTxt);

    }


}
