package com.example.dictionaryapp.feautre_dictionary.data.remote.test

data class WordDtoItem(
    val meanings: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val word: String
)