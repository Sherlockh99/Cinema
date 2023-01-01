package com.sherlock.gb.kotlin.cinema.model

data class Movie(
    val movie_title: String,
    val release_date: String,
    val year: Int,
    val picture: Int = 0
)

fun getDefaultMovie() = Movie("Форсаж","27.11.2018",2018)