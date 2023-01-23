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
import com.example.internetmarketing.databinding.ActivityHomeBinding
import com.example.internetmarketing.databinding.ActivityYouTubeBinding
import kotlin.system.exitProcess

class YouTubeActivity : AppCompatActivity() {

    lateinit var binding: ActivityYouTubeBinding

    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYouTubeBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)

        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

        supportActionBar!!.setCustomView(R.layout.toolbar_title_layout)

        supportActionBar!!.elevation = 0F

        binding.bottomNavigationView.selectedItemId = R.id.youtubeIdMenu

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


                    true

                }

                R.id.questionIdMenu -> {

                    startActivity(Intent(applicationContext, QuestionActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                    finish()

                }

            }


            false
        }

        binding.youMain.setOnClickListener {

            val intent = Intent(this, VideoOneActivity::class.java)

            intent.putExtra("video","main")

            startActivity(intent)

        }

        binding.youOne.setOnClickListener {

            val intent = Intent(this, VideoOneActivity::class.java)

            intent.putExtra("video","one")

            startActivity(intent)

        }


        binding.youTwo.setOnClickListener {

            val intent = Intent(this, VideoOneActivity::class.java)

            intent.putExtra("video","two")

            startActivity(intent)

        }

        binding.youThree.setOnClickListener {

            val intent = Intent(this, VideoOneActivity::class.java)

            intent.putExtra("video","three")

            startActivity(intent)

        }

        binding.youFour.setOnClickListener {

            val intent = Intent(this, VideoOneActivity::class.java)

            intent.putExtra("video","four")

            startActivity(intent)

        }

        binding.youFive.setOnClickListener {

            val intent = Intent(this, VideoOneActivity::class.java)

            intent.putExtra("video","five")

            startActivity(intent)

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
                builder.setPositiveButton("Ha",object : DialogInterface.OnClickListener{
                    override fun onClick(p0: DialogInterface?, p1: Int) {
                        finish()
                        exitProcess(0)
                    }
                })
                builder.setNegativeButton("Yo'q",object : DialogInterface.OnClickListener{
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