package com.example.a017retrofitexample

import com.example.a017retrofitexample.api.CatJson
import retrofit2.http.GET

interface ApiRequests {

    @GET("/facts/random")
    fun getCatFacts():retrofit2.Call<CatJson>
}