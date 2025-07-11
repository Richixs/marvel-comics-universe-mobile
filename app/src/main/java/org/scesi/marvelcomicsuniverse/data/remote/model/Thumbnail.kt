package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class Thumbnail(
    @SerializedName("path") val path: String? = null,
    @SerializedName("extension") val extension: String? = null
)
