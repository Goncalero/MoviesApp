package com.moviesapp.Domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class CastModel(

    var PicUrl : String = "",
    var Actor : String ="",

) : Parcelable
