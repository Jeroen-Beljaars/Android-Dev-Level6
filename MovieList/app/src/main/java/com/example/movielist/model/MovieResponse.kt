package com.example.movielist.model

import com.google.gson.annotations.SerializedName

data class MovieResponse (
    @SerializedName("results")
    var results: List<Movie>
)