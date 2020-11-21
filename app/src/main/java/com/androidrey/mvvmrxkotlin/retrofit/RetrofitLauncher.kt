package com.androidrey.mvvmrxkotlin.retrofit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitLauncher {

    companion object {
       var retrofit: Retrofit? = null
        const val URL_BASE = "https://jsonplaceholder.typicode.com"
        fun getInstance(): Retrofit? {

            if (retrofit == null) {

                retrofit = Retrofit.Builder().baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }

            return retrofit
        }
    }


}