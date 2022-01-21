package com.example.character.data.repository

import com.example.character.data.api.CharacterApi
import com.example.character.data.api.model.Character
import javax.inject.Inject

class CharacterRepo @Inject constructor(
    private val characterApi: CharacterApi
) {
    suspend fun getCharacters(): List<Character> {
        return characterApi.getCharacter()
    }
}