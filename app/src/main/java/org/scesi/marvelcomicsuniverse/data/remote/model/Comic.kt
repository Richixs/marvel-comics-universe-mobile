package org.scesi.marvelcomicsuniverse.data.remote.model

import com.google.gson.annotations.SerializedName

data class Comic(
    @SerializedName("id") override val id: Int? = null,
    @SerializedName("digitalId") val digitalId: Int? = null,
    @SerializedName("title") val title: String? = null,
    @SerializedName("issueNumber") val issueNumber: Double? = null,
    @SerializedName("variantDescription") val variantDescription: String? = null,
    @SerializedName("description")  val description: String? = null,
    @SerializedName("modified") val modified: String? = null,
    @SerializedName("isbn") val isbn: String? = null,
    @SerializedName("upc") val upc: String? = null,
    @SerializedName("diamondCode") val diamondCode: String? = null,
    @SerializedName("ean") val ean: String? = null,
    @SerializedName("issn") val issn: String? = null,
    @SerializedName("format") val format: String? = null,
    @SerializedName("pageCount") val pageCount: Int? = null,
    @SerializedName("textObjects") val textObjects: List<TextObject> = listOf(),
    @SerializedName("resourceURI") override val resourceURI: String? = null,
    @SerializedName("urls") val urls: List<Url> = listOf(),
    @SerializedName("series") val series: SeriesSummary? = null,
    @SerializedName("variants") val variants: List<ComicSummary> = listOf(),
    @SerializedName("collections") val collections: List<ComicSummary> = listOf(),
    @SerializedName("collectedIssues") val collectedIssues: List<ComicSummary> = listOf(),
    @SerializedName("dates") val comicDates: List<ComicDate> = listOf(),
    @SerializedName("prices") val prices: List<Price> = listOf(),
    @SerializedName("thumbnail") override val thumbnail: Thumbnail? = null,
    @SerializedName("images") val images: List<Thumbnail> = listOf(),
    @SerializedName("creators") val creators: ResourceList? = null,
    @SerializedName("characters") val characters: ResourceList? = null,
    @SerializedName("stories") val stories: ResourceList? = null,
    @SerializedName("events") val events: ResourceList? = null
): MarvelResult
