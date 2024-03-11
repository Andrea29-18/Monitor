package com.example.monitor.api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.GET;

public class ApiClient {

    public interface Service{
        @GET("all_hour.geojson")
        Call<EarthquakeJSONResponse> getEartquake();
    }

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build();

    private Service service;

    private static final ApiClient apiClient = new ApiClient();

    //Use el patron de singleton
    public static ApiClient getInstance(){
        return apiClient;
    }

    private ApiClient(){

    }

    public Service getService(){
        if(service == null){
            service = retrofit.create(Service.class);
        }
        return service;
    }

}
