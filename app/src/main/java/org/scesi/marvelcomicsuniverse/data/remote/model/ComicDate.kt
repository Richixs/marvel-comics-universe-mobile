package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class ComicDate(
    @SerializedName("type") val type: String? = null,
    @SerializedName("date") val date: String? = null
)
