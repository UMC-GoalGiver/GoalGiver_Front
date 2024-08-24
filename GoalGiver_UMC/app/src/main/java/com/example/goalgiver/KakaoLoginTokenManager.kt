package com.example.goalgiver

object KakaoLoginTokenManager {
    var accessToken: String? = null

    fun updateAccessToken(newToken: String) {
        accessToken = newToken
    }

    fun readAccessToken(): String? {
        return accessToken
    }
}