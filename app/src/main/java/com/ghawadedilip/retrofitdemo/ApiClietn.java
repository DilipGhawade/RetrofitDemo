package com.ghawadedilip.retrofitdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dilip on 21-Nov-17.
 */

public class ApiClietn {

  public  static final String BASE_URL="https://ghawadediilip.000webhostapp.com/Services/";
  public static Retrofit retrofit = null;

  public static Retrofit getApiClient()
  {
    if (retrofit==null)
    {
      retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()).build();

    }
    return retrofit;
  }
}
