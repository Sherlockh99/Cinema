package com.sherlock.gb.kotlin.cinema.model

data class Movie(
    val movie_title: String,
    val original_title: String,
    val year: Int,
    val picture: Int = 0
)