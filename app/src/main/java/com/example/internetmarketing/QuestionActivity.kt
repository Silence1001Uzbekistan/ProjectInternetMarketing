package com.example.internetmarketing

import android.app.AlertDialog
import android.content.DialogInterface
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
import kotlin.system.exitProcess

class QuestionActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuestionBinding

    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)

        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

        supportActionBar!!.setCustomView(R.layout.toolbar_title_layout)

        supportActionBar!!.elevation = 0F

        binding.bottomNavigationView.selectedItemId = R.id.questionIdMenu


        binding.nextBtn.setOnClickListener {

            startActivity(Intent(this, QuizActivity::class.java))
            finish()

        }

        binding.bottomNavigationView.setOnItemSelectedListener {


            val id = it.itemId

            when (id) {


                R.id.homeIdMenu -> {

                    startActivity(Intent(applicationContext, HomeActivity::class.java))
                    overridePendingTransition(0, 0)
                    true

                    finish()

                }

                R.id.youtubeIdMenu -> {

                    startActivity(Intent(applicationContext, YouTubeActivity::class.java))
                    overridePendingTransition(0, 0)
                    true

                    finish()

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

            R.id.usedLiteratureMenu -> {

                val builder = AlertDialog.Builder(this)

                builder.setTitle("Dasturni yopish")
                builder.setMessage("Dasturdan chiqishni xohlaysizmi ?")
                builder.setCancelable(false)
                builder.setPositiveButton("Ha", object : DialogInterface.OnClickListener {
                    override fun onClick(p0: DialogInterface?, p1: Int) {
                        finish()
                        exitProcess(0)
                    }
                })
                builder.setNegativeButton("Yo'q", object : DialogInterface.OnClickListener {
                    override fun onClick(p0: DialogInterface?, p1: Int) {


                    }

                })

                builder.show()

            }

        }

        return super.onOptionsItemSelected(item)

    }


    override fun onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            finish()
            super.onBackPressed()
        } else {
            Toast.makeText(this, "Dasturdan chiqish uchun ketma ket tez bosing", Toast.LENGTH_SHORT)
                .show()
        }

        backPressedTime = System.currentTimeMillis()

    }

}