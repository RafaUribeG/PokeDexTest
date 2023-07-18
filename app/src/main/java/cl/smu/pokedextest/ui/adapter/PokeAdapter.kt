package cl.smu.pokedextest.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.smu.pokedextest.databinding.ItemApiBinding
import cl.smu.pokedextest.model.data.Pokemon

class PokeAdapter(val listPokemon : List<Pokemon>) : RecyclerView.Adapter<PokeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeViewHolder {
        val binding = ItemApiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokeViewHolder(binding)
    }

    override fun onBindViewHolder(viewholder: PokeViewHolder, position: Int) {
        viewholder.bind(listPokemon[position])
    }

    override fun getItemCount(): Int = listPokemon.size

}