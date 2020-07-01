package com.yesimyildirim.mvvmlivedata.service

import com.yesimyildirim.mvvmlivedata.model.ModelData
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class APIUrl {
    private val BASE_URL = "https://api.github.com/users/hadley/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(DataAPI::class.java)

    fun getData() : Single<List<ModelData>> {
        return api.getBaseData()
    }


}