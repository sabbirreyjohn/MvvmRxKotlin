package com.androidrey.mvvmrxkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.androidrey.mvvmrxkotlin.R
import com.androidrey.mvvmrxkotlin.viewmodel.PhotoViewModel

class MainActivity : AppCompatActivity() {

    val photoViewModel: PhotoViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        photoViewModel.getPhotos().observe(this, Observer {
            Toast.makeText(this, it.get(1).title, Toast.LENGTH_LONG).show()
        })
    }
}