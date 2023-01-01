package com.sherlock.gb.kotlin.cinema.model
data class AboutMovie(
    val movie: Movie = getDefaultMovie(),
    val release_date: String = "27.11.2018",
    val rating: String = "5.5"
 )