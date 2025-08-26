package com.moviesapp.Domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FilmItemModel(

    var Title : String = "",
    var Description : String = "",
    var Poster : String = "",
    var Time : String = "",
    var Trailer : String = "",
    var Imdb : Int = 0,
    var Year : Int = 0,
    var Price : Double = 0.0,
    var Genre : ArrayList<String> = ArrayList(),
    var Casts : ArrayList<CastModel> = ArrayList(),

) : Parcelable
