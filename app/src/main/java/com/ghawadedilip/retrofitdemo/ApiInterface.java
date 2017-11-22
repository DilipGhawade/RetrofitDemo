package com.ghawadedilip.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Dilip on 21-Nov-17.
 */

public interface ApiInterface {

  @POST("contacts.php")
  Call<List<Contact>> getContact();
  }
