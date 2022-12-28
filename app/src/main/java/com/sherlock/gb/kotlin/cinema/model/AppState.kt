package com.sherlock.gb.kotlin.cinema.model

sealed class AppState {
    data class Success(val AboutMovieData : AboutMovie) : AppState()
    data class Error(val error : Throwable) : AppState()
    object Loading : AppState()
}
