package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class ComicSummary(
    @SerializedName("resourceURI") val resourceURI: String? = null,
    @SerializedName("name") val name: String? = null,
)
