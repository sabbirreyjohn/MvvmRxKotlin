package com.androidrey.mvvmrxkotlin.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.androidrey.mvvmrxkotlin.model.Photo
import com.androidrey.mvvmrxkotlin.repository.PhotoRepository


class PhotoViewModel(application: Application) : AndroidViewModel(application) {



    fun getPhotos(): MutableLiveData<List<Photo>> {
        return PhotoRepository.getPhotos()
    }

}