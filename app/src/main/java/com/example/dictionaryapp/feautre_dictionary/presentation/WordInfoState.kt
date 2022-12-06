package com.example.dictionaryapp.feautre_dictionary.presentation

import com.example.dictionaryapp.feautre_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
