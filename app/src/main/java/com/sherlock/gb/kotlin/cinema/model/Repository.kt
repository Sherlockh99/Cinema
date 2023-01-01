package com.sherlock.gb.kotlin.cinema.model

interface Repository {
    fun getAboutMovieFromServer(): AboutMovie
    fun getAboutMovieLocalStorage(): AboutMovie
}