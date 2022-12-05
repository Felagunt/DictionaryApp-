package com.example.dictionaryapp.feautre_dictionary.domain.model

import com.example.dictionaryapp.feautre_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)