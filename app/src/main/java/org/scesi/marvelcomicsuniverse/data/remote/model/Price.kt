package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("type") val type: String? = null,
    @SerializedName("price") val price: Double? = null
)
