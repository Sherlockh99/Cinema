package com.sherlock.gb.kotlin.cinema.model

class RepositoryImpl : Repository {
    override fun getAboutMovieFromServer(): AboutMovie {
        return AboutMovie()
    }

    override fun getAboutMovieLocalStorage(): AboutMovie {
        return AboutMovie()
    }
}