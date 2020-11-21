package com.androidrey.mvvmrxkotlin.retrofit

import android.database.Observable
import com.androidrey.mvvmrxkotlin.model.Photo
import retrofit2.Call
import retrofit2.http.GET

interface PhotoHandler {

    @GET("/photos")
    fun getPhotos(): Call<List<Photo>>
}