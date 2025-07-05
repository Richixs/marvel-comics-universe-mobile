package org.scesi.marvelcomicsuniverse.data.remote.api

import org.scesi.marvelcomicsuniverse.data.remote.model.Character
import org.scesi.marvelcomicsuniverse.data.remote.model.MarvelResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApiService {
    @GET("v1/public/characters")
    suspend fun getCharacters(
        @Query("ts") timestamp: String,
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String
    ): Response<MarvelResponse<Character>>
}