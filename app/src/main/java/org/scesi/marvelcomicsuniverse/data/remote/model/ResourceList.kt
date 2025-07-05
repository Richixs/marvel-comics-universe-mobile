package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class ResourceList(
    @SerializedName("available") val available: Int? = null,
    @SerializedName("collectionURI") val collectionURI: String? = null,
    @SerializedName("items") val items: List<ResourceItem> = emptyList(),
    @SerializedName("returned") val returned: Int? = null
)
