package com.example.mygamesphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://pokeapi.co/api/v2/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface MyGamesPhotosApiService {
    @GET("pokemon/ditto")
    suspend fun getPhotos() : String
}

object MyGamesApi {
    val retrofitService : MyGamesPhotosApiService by lazy {}
        retrofit.create(MyGamesPhotosApiService::class.java)
}