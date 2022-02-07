package com.example.mastercode.network

import com.example.mastercode.domain.CountriesDataModel
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


/*
private const val BaseURL="https://restcountries.com/v3/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .baseUrl(BaseURL)
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .build()
*/

interface RestApi{

    @GET("all")
    fun  getCountriesDataAsync():Deferred<List<CountriesDataModel>>


}

/*
object Network{


    val networkReq:RestApi by lazy {
        retrofit.create(RestApi::class.java)
    }

}*/
