package com.sherlock.gb.kotlin.cinema.model

interface Repository {
    fun getAboutMovieFromServer(): AboutMovie
    fun getAboutMovieLocalStorageNowPlaying(): List<AboutMovie>
    fun getAboutMovieLocalStorageUpcoming(): List<AboutMovie>
}