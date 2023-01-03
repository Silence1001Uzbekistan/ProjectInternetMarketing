package com.example.internetmarketing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.internetmarketing.databinding.ActivityHomeBinding
import com.example.internetmarketing.databinding.ActivityMainBinding.inflate

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)

        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

        supportActionBar!!.setCustomView(R.layout.toolbar_title_layout)

        supportActionBar!!.elevation = 0F


        binding.buttonOne.setOnClickListener {

            startActivity(Intent(this, HomeOneActivity::class.java))

        }

        binding.buttonTwo.setOnClickListener {

            startActivity(Intent(this, HomeTwoActivity::class.java))

        }

        binding.buttonThree.setOnClickListener {

            startActivity(Intent(this, HomeThreeActivity::class.java))

        }

        binding.bottomNavigationView.selectedItemId = R.id.homeIdMenu


        binding.bottomNavigationView.setOnItemSelectedListener {

            val id = it.itemId

            when (id) {


                R.id.homeIdMenu -> {

                    true


                }

                R.id.youtubeIdMenu -> {

                    startActivity(Intent(applicationContext, YouTubeActivity::class.java))
                    overridePendingTransition(0, 0)
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