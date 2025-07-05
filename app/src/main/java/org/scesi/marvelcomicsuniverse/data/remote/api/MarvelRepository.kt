package org.scesi.marvelcomicsuniverse.data.remote.api

import org.scesi.marvelcomicsuniverse.BuildConfig
import org.scesi.marvelcomicsuniverse.data.remote.model.Character
import org.scesi.marvelcomicsuniverse.data.remote.model.MarvelResponse
import retrofit2.Response

class MarvelRepository {
    private val publicKey = BuildConfig.MARVEL_PUBLIC_KEY
    private val privateKey = BuildConfig.MARVEL_PRIVATE_KEY
    private val apiService = ApiClient.instance

    suspend fun getCharacters(): Response<MarvelResponse<Character>> {
        val timestamp = System.currentTimeMillis().toString()
        val hash = AuthHelper.getHash(timestamp, privateKey, publicKey)
        return apiService.getCharacters(timestamp, publicKey, hash)
    }
}