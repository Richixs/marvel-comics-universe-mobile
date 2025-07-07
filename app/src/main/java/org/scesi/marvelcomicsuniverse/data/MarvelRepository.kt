package org.scesi.marvelcomicsuniverse.data

import org.scesi.marvelcomicsuniverse.BuildConfig
import org.scesi.marvelcomicsuniverse.data.remote.api.ApiClient
import org.scesi.marvelcomicsuniverse.data.remote.api.AuthHelper
import org.scesi.marvelcomicsuniverse.data.remote.model.Character
import org.scesi.marvelcomicsuniverse.data.remote.model.Comic
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

    suspend fun getComics(): Response<MarvelResponse<Comic>> {
        val timestamp = System.currentTimeMillis().toString()
        val hash = AuthHelper.getHash(timestamp, privateKey, publicKey)
        return apiService.getComics(timestamp, publicKey, hash)
    }
}