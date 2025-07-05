package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class Series(
    @SerializedName("id") val id: Int? = null,
    @SerializedName("title") val title: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("resourceURI") val resourceURI: String? = null,
    @SerializedName("urls") val urls: List<Url>? = null,
    @SerializedName("startYear") val startYear: Int? = null,
    @SerializedName("endYear") val endYear: Int? = null,
    @SerializedName("rating") val rating: String? = null,
    @SerializedName("modified") val modified: String? = null,
    @SerializedName("thumbnail") val thumbnail: Thumbnail? = null,
    @SerializedName("comics") val comics: ResourceList? = null,
    @SerializedName("stories") val stories: ResourceList? = null,
    @SerializedName("events") val events: ResourceList? = null,
    @SerializedName("characters") val characters: ResourceList? = null,
    @SerializedName("creators") val creators: ResourceList? = null,
    @SerializedName("next") val next: SeriesSummary? = null,
    @SerializedName("previous") val previous: SeriesSummary? = null
)
