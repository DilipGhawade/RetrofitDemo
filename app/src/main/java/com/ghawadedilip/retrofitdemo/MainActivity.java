package com.ghawadedilip.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
  private RecyclerAdapter adapter;
  private RecyclerView recyclerView;
  private RecyclerView.LayoutManager layoutManager;
  private List<Contact> contacts;
  private ApiInterface apiInterface;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    recyclerView = (RecyclerView)findViewById(R.id.reyclerview);
    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);

    apiInterface= ApiClietn.getApiClient().create(ApiInterface.class);
    retrofit2.Call<List<Contact>> call =  apiInterface.getContact();
    call.enqueue(new Callback<List<Contact>>() {
      @Override
      public void onResponse(retrofit2.Call<List<Contact>> call, Response<List<Contact>> response)
      {

        contacts = response.body();
        adapter= new RecyclerAdapter(contacts);
        recyclerView.setAdapter(adapter);
      }

      @Override
      public void onFailure(retrofit2.Call<List<Contact>> call, Throwable t) {

      }
    });


  }
}
