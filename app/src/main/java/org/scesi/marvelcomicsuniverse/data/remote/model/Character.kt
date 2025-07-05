package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("id") val id: Int? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("modified") val modified: String? = null,
    @SerializedName("resourceURI")  val resourceURI: String? = null,
    @SerializedName("urls") val urls: List<Url>? = null,
    @SerializedName("thumbnail") val thumbnail: Thumbnail? = null,
    @SerializedName("comics") val comics: ResourceList? = null,
    @SerializedName("stories") val stories: ResourceList? = null,
    @SerializedName("events") val events: ResourceList? = null,
    @SerializedName("series") val series: ResourceList? = null
)
