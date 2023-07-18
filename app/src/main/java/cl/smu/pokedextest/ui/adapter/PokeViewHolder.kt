package cl.smu.pokedextest.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import cl.smu.pokedextest.databinding.ItemApiBinding
import cl.smu.pokedextest.model.data.Pokemon

class PokeViewHolder(val binding : ItemApiBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(dataPokemon : Pokemon){
        with(binding){
            tvNamePokemon.text = dataPokemon.name
            tvStatus.text = dataPokemon.baseExperience.toString()
            tvSpecies.text = dataPokemon.species.name
        }
    }

}