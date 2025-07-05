package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class TextObject(
    @SerializedName("type") val type: String? = null,
    @SerializedName("language") val language: String? = null,
    @SerializedName("text") val text: String? = null
)
