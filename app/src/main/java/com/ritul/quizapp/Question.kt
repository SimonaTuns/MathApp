package com.ritul.quizapp

data class Question (
    val id: Int,
    val question: String,
    val first: String,
    val second: String,
    val third: String,
    val fourth: String,
    val correctAnswer: Int
)