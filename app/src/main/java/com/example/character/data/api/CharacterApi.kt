package com.example.character.data.api

import com.example.character.data.api.model.Character
import retrofit2.http.GET

interface CharacterApi {

    @GET(ApiConstants.END_POINTS)
    suspend fun getCharacter():List<Character>
}