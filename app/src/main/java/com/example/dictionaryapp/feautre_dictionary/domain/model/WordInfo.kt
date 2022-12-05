package com.example.dictionaryapp.feautre_dictionary.domain.model


data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val origin: String,
    val word: String
)