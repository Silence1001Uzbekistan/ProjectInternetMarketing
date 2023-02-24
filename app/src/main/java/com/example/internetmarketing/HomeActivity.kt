package com.example.internetmarketing

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.internetmarketing.databinding.ActivityHomeBinding
import com.example.internetmarketing.databinding.ActivityMainBinding.inflate
import com.example.internetmarketing.databinding.DialogKeyBinding
import com.google.android.material.snackbar.Snackbar
import kotlin.system.exitProcess

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)

        //popup menu button id
        registerForContextMenu(binding.keyNext)

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

        binding.buttonFour.setOnClickListener {

            startActivity(Intent(this, HomeActivityFour::class.java))

        }

        binding.bookNext.setOnClickListener {

            startActivity(Intent(this, AdabiyotlarActivity::class.java))

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
                    finish()

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

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {


        menuInflater.inflate(R.menu.top_menu, menu)



        return super.onCreateOptionsMenu(menu)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.pop_up_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.item1 -> {

                val intent = Intent(Intent.ACTION_VIEW)

                intent.data = Uri.parse("https://uz.wikipedia.org/wiki/Internet")

                startActivity(intent)

            }

            R.id.item2 -> {

                val intent = Intent(Intent.ACTION_VIEW)

                intent.data = Uri.parse("https://uz.wikipedia.org/wiki/Facebook")

                startActivity(intent)

            }

            R.id.item3 -> {

                val intent = Intent(Intent.ACTION_VIEW)

                intent.data = Uri.parse("https://uz.wikipedia.org/wiki/Ijtimoiy_tarmoq")

                startActivity(intent)

            }

            R.id.item4 -> {

                val intent = Intent(Intent.ACTION_VIEW)

                intent.data = Uri.parse("https://uz.wikipedia.org/wiki/Marketing")

                startActivity(intent)

            }

            R.id.item5 -> {

                val intent = Intent(Intent.ACTION_VIEW)

                intent.data = Uri.parse("https://uz.wikipedia.org/wiki/Dasturlash")

                startActivity(intent)

            }

        }

        return super.onContextItemSelected(item)
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