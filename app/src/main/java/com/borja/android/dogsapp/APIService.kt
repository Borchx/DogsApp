package com.borja.android.dogsapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url


interface APIService {
    //3 APISERVICE GET
    @GET
    suspend fun getDogsByBreeds(@Url url:String):Response<DogsResponse>

    //no me muestra nada?
}