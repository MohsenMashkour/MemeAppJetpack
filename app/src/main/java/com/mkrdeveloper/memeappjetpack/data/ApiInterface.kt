package com.mkrdeveloper.memeappjetpack.data

import com.mkrdeveloper.memeappjetpack.models.AllMemesData
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("get_memes")
    suspend fun getMemesList() : Response<AllMemesData>
}