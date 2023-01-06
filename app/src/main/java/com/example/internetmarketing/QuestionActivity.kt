package com.example.internetmarketing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.internetmarketing.Papka.QuizActivity
import com.example.internetmarketing.databinding.ActivityQuestionBinding
import com.example.internetmarketing.databinding.ActivityYouTubeBinding

class QuestionActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)

        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

        supportActionBar!!.setCustomView(R.layout.toolbar_title_layout)

        supportActionBar!!.elevation = 0F

        binding.bottomNavigationView.selectedItemId = R.id.questionIdMenu


        binding.nextBtn.setOnClickListener {

            startActivity(Intent(this,QuizActivity::class.java))

        }

        binding.bottomNavigationView.setOnItemSelectedListener {



            val id = it.itemId

            when (id) {


                R.id.homeIdMenu -> {

                    startActivity(Intent(applicationContext, HomeActivity::class.java))
                    overridePendingTransition(0, 0)
                    true


                }

                R.id.youtubeIdMenu -> {

                    startActivity(Intent(applicationContext, YouTubeActivity::class.java))
                    overridePendingTransition(0, 0)
                    true

                }

                R.id.questionIdMenu -> {


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