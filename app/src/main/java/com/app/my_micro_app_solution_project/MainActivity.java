package com.app.my_micro_app_solution_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
   ArrayList<Datum> datummodel = new ArrayList<>();
    ArrayList<Pro_Model> productModellist = new ArrayList<>();
    String pname;
    RecyclerviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
       adapter=new RecyclerviewAdapter(MainActivity.this,productModellist);


       Instance_Class.CallAPI().callMain(pname="com.backupcall.videorecover.deleted").enqueue(new Callback<MainModels>() {
           @Override
           public void onResponse(Call<MainModels> call, Response<MainModels> response) {
               Log.d("TTT", "onResponse:response======= "+response.body().getDeveloparname());


               datummodel= (ArrayList<Datum>) response.body().getData();

               for (int i=0;i<datummodel.size();i++)
               {
                   String appname=response.body().getData().get(i).getApp_name();
                   String applink=response.body().getData().get(i).getApp_link();
                   String applogo=response.body().getData().get(i).getApp_logo();
                   String packagename=response.body().getData().get(i).getPackage_name();

                   Pro_Model proModel=new Pro_Model(appname,applink,applogo,packagename);
                   productModellist.add(proModel);
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();

               }
           }

           @Override
           public void onFailure(Call<MainModels> call, Throwable t) {
               Log.d("TTT", "onFailure: Error"+t.getLocalizedMessage());
               Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
           }
       });






    }
}