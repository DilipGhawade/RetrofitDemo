package com.ghawadedilip.retrofitdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dilip on 21-Nov-17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

  List<Contact> contacts;

  public RecyclerAdapter(List<Contact>contacts)
  {
    this.contacts=contacts;
  }


  @Override
  public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate
      (R.layout.list_item,parent,false);
    return new MyViewHolder(v);
  }

  @Override
  public void onBindViewHolder(MyViewHolder holder, int position) {

    holder.name.setText(contacts.get(position).getEmpName());
    holder.email.setText(contacts.get(position).getEmpEmail());


  }

  @Override
  public int getItemCount() {
    return contacts.size();
  }

  public class MyViewHolder extends RecyclerView.ViewHolder
  {
    TextView name,email;

    public MyViewHolder(View itemView) {
      super(itemView);

      name = (TextView)itemView.findViewById(R.id.txt_empname);
      email = (TextView)itemView.findViewById(R.id.txt_empemail);
    }
  }
}
