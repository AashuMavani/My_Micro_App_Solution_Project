package com.app.my_micro_app_solution_project;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Retro_Interface {
    @FormUrlEncoded
    @POST("app_detail.php")
    Call<MainModels> callMain(@Field("pname")
                              String pname);
}
