package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class SeriesSummary(
    @SerializedName("resourceURI") val resourceURI: String? = null,
    @SerializedName("name") val name: String? = null,
)
