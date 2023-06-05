package com.borja.android.dogsapp

import com.google.gson.annotations.SerializedName

data class DogsResponse(
    @SerializedName("message") var images:List<String>,
    @SerializedName("status") var status:String
)