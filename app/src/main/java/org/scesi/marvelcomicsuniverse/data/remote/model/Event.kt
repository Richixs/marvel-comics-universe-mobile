package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("id") override val id: Int? = null,
    @SerializedName("title") val title: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("resourceURI") override val resourceURI: String? = null,
    @SerializedName("urls") val urls: List<Url>? = null,
    @SerializedName("modified") val modified: String? = null,
    @SerializedName("start") val start: String? = null,
    @SerializedName("end") val end: String? = null,
    @SerializedName("thumbnail") override val thumbnail: Thumbnail? = null,
    @SerializedName("comics") val comics: ResourceList? = null,
    @SerializedName("stories") val stories: ResourceList? = null,
    @SerializedName("series") val series: ResourceList? = null,
    @SerializedName("characters") val characters: ResourceList? = null,
    @SerializedName("creators") val creators: ResourceList? = null,
    @SerializedName("next") val next: EventSummary? = null,
    @SerializedName("previous") val previous: EventSummary? = null
): MarvelResult
