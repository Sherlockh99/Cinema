package com.sherlock.gb.kotlin.cinema.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sherlock.gb.kotlin.cinema.model.Repository
import com.sherlock.gb.kotlin.cinema.model.RepositoryImpl

class MainViewModel(
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()
) : ViewModel() {

    fun getLiveData() = liveDataToObserve

    fun getAboutMovie() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveDataToObserve.value = AppState.Loading

        Thread {
            Thread.sleep(2000)

            liveDataToObserve.postValue(
                AppState.Success(repositoryImpl.getAboutMovieLocalStorage())
            )
        }.start()
    }
}