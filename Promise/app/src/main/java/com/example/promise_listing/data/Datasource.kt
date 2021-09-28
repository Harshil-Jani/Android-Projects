package com.example.promise_listing.data

import com.example.promise_listing.R
import com.example.promise_listing.model.Promise

class Datasource {
    fun loadPromise(): List<Promise> {
        return listOf<Promise>(
            Promise(R.string.promise1, R.drawable.image1),
            Promise(R.string.promise2,R.drawable.image2),
            Promise(R.string.promise3,R.drawable.image3),
            Promise(R.string.promise4,R.drawable.image4),
            Promise(R.string.promise5,R.drawable.image5),
            Promise(R.string.promise6,R.drawable.image6),
            Promise(R.string.promise7,R.drawable.image7),
            Promise(R.string.promise8,R.drawable.image8),
            Promise(R.string.promise9,R.drawable.image9),
            Promise(R.string.promise10,R.drawable.image10)
        )
    }
}