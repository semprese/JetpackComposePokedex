package com.bignerdranch.android.jetpackcomposepokedex.repository

import androidx.compose.ui.unit.IntOffset
import com.bignerdranch.android.jetpackcomposepokedex.data.remote.PokeApi
import com.bignerdranch.android.jetpackcomposepokedex.data.remote.responces.Pokemon
import com.bignerdranch.android.jetpackcomposepokedex.data.remote.responces.PokemonList
import com.bignerdranch.android.jetpackcomposepokedex.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
){

    suspend fun getPokemonList(limit:Int, offset: Int): Resource<PokemonList>{
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception){
            return Resource.Error(message = "An unknown error occured.")
        }
        return Resource.Success(response)
    }
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception){
            return Resource.Error(message = "An unknown error occured.")
        }
        return Resource.Success(response)
    }

}