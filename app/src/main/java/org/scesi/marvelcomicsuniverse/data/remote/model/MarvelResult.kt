package org.scesi.marvelcomicsuniverse.data.remote.model

interface MarvelResult {
    val id: Int?
    val resourceURI : String?
    val thumbnail: Thumbnail?
}