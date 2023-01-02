package com.example.internetmarketing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.internetmarketing.databinding.ActivityHomeOneBinding

class HomeOneActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeOneBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)



    }
}