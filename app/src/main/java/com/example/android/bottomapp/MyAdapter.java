package com.example.android.bottomapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by eKasiLab Alex CDTB on 2017/07/24.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>  {

    Context context;
    List<Contact> contactList;

    public MyAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.screen_view,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Contact contact = contactList.get(position);
        holder.txtTitle.setText(contact.getTitle());
        holder.txtTembisa.setText(contact.getTembisa());
        holder.txtGauteng.setText(contact.getGauteng());
        holder.txtLebogang.setText(contact.getLebogang());

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitle;
        TextView txtTembisa;
        TextView txtGauteng;
        TextView txtLebogang;
        public MyViewHolder(View itemView) {
            super(itemView);
//            txtTittle =  (TextView) itemView.findViewById(R.id.title);
//            txtTembisa = (TextView)  itemView.findViewById(R.id.txtTembisa);
//            txtGauteng = (TextView)  itemView.findViewById(R.id.txtGauteng);
//            txtLebogang = (TextView) itemView.findViewById(R.id.txtLebogang);
        }
    }
}







