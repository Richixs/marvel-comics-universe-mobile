package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class Creator(
    @SerializedName("id") val id: Int? = null,
    @SerializedName("firstName") val firstName: String? = null,
    @SerializedName("middleName") val middleName: String? = null,
    @SerializedName("lastName") val lastName: String? = null,
    @SerializedName("suffix") val suffix: String? = null,
    @SerializedName("fullName") val fullName: String? = null,
    @SerializedName("modified") val modified: String? = null,
    @SerializedName("resourceURI") val resourceURI: String? = null,
    @SerializedName("urls") val urls: List<ResourceItem>? = null,
    @SerializedName("thumbnail") val thumbnail: Thumbnail? = null,
    @SerializedName("series") val series: ResourceList? = null,
    @SerializedName("stories") val stories: ResourceList? = null,
    @SerializedName("comics") val comics: ResourceList? = null,
    @SerializedName("events") val events: ResourceList? = null
)
