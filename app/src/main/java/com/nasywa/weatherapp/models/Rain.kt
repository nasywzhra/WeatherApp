package com.nasywa.weatherapp.models

import com.google.gson.annotations.SerializedName

data class Rain (
    @field:SerializedName("1h")
    val h: Double
)
