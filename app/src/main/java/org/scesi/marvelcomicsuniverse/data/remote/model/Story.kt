package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class Story(
    @SerializedName("id") override val id: Int? = null,
    @SerializedName("title") val title: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("resourceURI") override val resourceURI: String? = null,
    @SerializedName("type") val type: String? = null,
    @SerializedName("modified") val modified: String? = null,
    @SerializedName("thumbnail") override val thumbnail: Thumbnail? = null,
    @SerializedName("comics") val comics: ResourceList? = null,
    @SerializedName("series") val series: ResourceList? = null,
    @SerializedName("events") val events: ResourceList? = null,
    @SerializedName("characters") val characters: ResourceList? = null,
    @SerializedName("creators") val creators: ResourceList? = null,
    @SerializedName("originalIssue") val originalIssue: ComicSummary? = null
): MarvelResult
