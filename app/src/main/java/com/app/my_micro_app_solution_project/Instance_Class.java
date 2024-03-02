package com.app.my_micro_app_solution_project;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Instance_Class {
    public static Retro_Interface CallAPI(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://www.digitalbussiness.com/projects/ad_king/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(Retro_Interface.class);
    }
}
