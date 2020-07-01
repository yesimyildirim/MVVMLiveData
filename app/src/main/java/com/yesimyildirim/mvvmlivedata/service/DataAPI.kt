package com.yesimyildirim.mvvmlivedata.service

import com.yesimyildirim.mvvmlivedata.model.ModelData
import io.reactivex.Single
import retrofit2.http.GET

interface DataAPI {
    //https://api.github.com/users/hadley/
    @GET("orgs")
    fun getBaseData(): Single<List<ModelData>>
}