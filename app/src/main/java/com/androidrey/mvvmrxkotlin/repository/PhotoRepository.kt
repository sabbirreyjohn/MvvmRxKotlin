package com.androidrey.mvvmrxkotlin.repository

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.androidrey.mvvmrxkotlin.model.Photo
import com.androidrey.mvvmrxkotlin.retrofit.PhotoHandler
import com.androidrey.mvvmrxkotlin.retrofit.RetrofitLauncher
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

object PhotoRepository {

    var photoHandler: PhotoHandler

    init {
        photoHandler = RetrofitLauncher.getInstance()!!.create(PhotoHandler::class.java)
    }



    fun getPhotos(): MutableLiveData<List<Photo>> {
        val lvPhotos = MutableLiveData<List<Photo>>()
        photoHandler.getPhotos().enqueue(object : Callback<List<Photo>> {
            override fun onResponse(
                call: Call<List<Photo>>,
                response: Response<List<Photo>>
            ) {
                Log.i("response", response.body().toString())
                lvPhotos.value = response.body()
            }

            override fun onFailure(call: Call<List<Photo>>, t: Throwable) {
                TODO("Not yet implemented")
                lvPhotos.value = null
            }
        })

        return lvPhotos
    }

}