package com.example.promise_listing.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Promise(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    ){

}