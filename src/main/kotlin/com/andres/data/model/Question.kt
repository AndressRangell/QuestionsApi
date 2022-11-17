package com.andres.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Question(
    val title: String,
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val answer: String
)