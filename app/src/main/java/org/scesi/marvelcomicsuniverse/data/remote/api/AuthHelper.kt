package org.scesi.marvelcomicsuniverse.data.remote.api

import java.math.BigInteger
import java.security.MessageDigest

object AuthHelper {
    fun getHash(timestamp: String, privateKey: String, publicKey: String): String {
        val input = "$timestamp$privateKey$publicKey"
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
    }
}