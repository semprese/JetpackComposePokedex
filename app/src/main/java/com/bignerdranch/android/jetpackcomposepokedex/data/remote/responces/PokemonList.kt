package com.bignerdranch.android.jetpackcomposepokedex.data.remote.responces

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)