package cl.smu.pokedextest.model.network

import cl.smu.pokedextest.model.data.Pokemon
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {
    @GET("{name}")
    suspend fun getPokemon(@Path("name") name : String) : Response <Pokemon>
}