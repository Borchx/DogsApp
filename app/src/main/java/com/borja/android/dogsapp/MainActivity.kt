package com.borja.android.dogsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.borja.android.dogsapp.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {

    //1º Binding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_main)

    }

    //4º Retrofit
    private fun getRetrofit(): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl("https://dog.ceo/api/breed/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //5º Coroutines
    private fun searchByName(query: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val response = getRetrofit().create(APIService::class.java).getDogsByBreeds(query)
            val puppies = response.body()
            //Volver al Hilo principial
            runOnUiThread {
                if (response.isSuccessful){
                    //Mostrar recyclerView
                }else{
                    showError()
                }
            }
        }
    }

    private fun showError() {
        Toast.makeText(this,"ERROR",Toast.LENGTH_LONG).show()
    }

}