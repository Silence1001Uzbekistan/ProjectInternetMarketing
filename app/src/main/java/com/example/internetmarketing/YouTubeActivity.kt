package com.example.internetmarketing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.internetmarketing.databinding.ActivityHomeBinding
import com.example.internetmarketing.databinding.ActivityYouTubeBinding

class YouTubeActivity : AppCompatActivity() {

    lateinit var binding: ActivityYouTubeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYouTubeBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)

        Toast.makeText(this, "YouTube", Toast.LENGTH_SHORT).show()

        binding.bottomNavigationView.selectedItemId = R.id.youtubeIdMenu

        binding.bottomNavigationView.setOnItemSelectedListener {

            val id = it.itemId

            when (id) {


                R.id.homeIdMenu -> {

                    startActivity(Intent(applicationContext, HomeActivity::class.java))
                    overridePendingTransition(0, 0)
                    true


                }

                R.id.youtubeIdMenu -> {


                    true

                }

                R.id.questionIdMenu -> {

                    startActivity(Intent(applicationContext, QuestionActivity::class.java))
                    overridePendingTransition(0, 0)
                    true

                }

            }


            false
        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {


        menuInflater.inflate(R.menu.top_menu, menu)



        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        when (id) {
            R.id.aboutAppMenu -> {

                Toast.makeText(this, "A", Toast.LENGTH_SHORT).show()

            }

            R.id.usedLiteratureMenu -> {

                Toast.makeText(this, "B", Toast.LENGTH_SHORT).show()

            }

        }

        return super.onOptionsItemSelected(item)

    }
}