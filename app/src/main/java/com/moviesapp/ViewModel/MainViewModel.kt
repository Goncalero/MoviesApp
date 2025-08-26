package com.moviesapp.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.moviesapp.Domain.FilmItemModel
import com.moviesapp.Repository.MainRepository

class MainViewModel : ViewModel() {

    private val repository = MainRepository()

    fun loadUpcoming(): LiveData<MutableList<FilmItemModel>>{

        return repository.loadUpcoming()
    }

    fun loadItems(): LiveData<MutableList<FilmItemModel>>{

        return repository.loadItems()

    }

}