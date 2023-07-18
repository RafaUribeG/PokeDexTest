package cl.smu.pokedextest.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.smu.pokedextest.databinding.ActivityMainBinding
import cl.smu.pokedextest.model.data.Pokemon
import cl.smu.pokedextest.model.network.ApiClient
import cl.smu.pokedextest.model.network.ApiRest
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }

}