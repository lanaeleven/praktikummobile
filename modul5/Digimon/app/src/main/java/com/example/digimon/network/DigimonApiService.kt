package com.example.digimon.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


private const val BASE_URL = "https://digimon-api.vercel.app"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface DigimonApiService {
    @GET("api/digimon")
    suspend fun getData(): List<DigimonData>
}

object DigimonApi {
    val retrofitService : DigimonApiService by lazy {
        retrofit.create(DigimonApiService::class.java) }
}