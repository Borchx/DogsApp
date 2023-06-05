package com.borja.android.dogsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.borja.android.dogsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //1º Binding
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_main)
    }


}