package com.androidrey.mvvmrxkotlin.model

import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("albumId")
    val albumId: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val photoUrl: String,
    @SerializedName("thumbnailUrl")
    val thumbnailUrl: String
)