package com.example.internetmarketing

import android.content.Intent
import android.content.pm.ActivityInfo
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.example.internetmarketing.databinding.ActivityVideoOneBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class VideoOneActivity : YouTubeBaseActivity() {


    val VIDEO_API_KEY = "AIzaSyBFvCVjj0KbUgBlcjWTDahHwTiNTRpRjMI"

    lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    lateinit var youTubePlayer: YouTubePlayerView

    lateinit var binding: ActivityVideoOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoOneBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)


        youTubePlayer = findViewById(R.id.youtubePlayer)

        val id = intent.extras!!.getString("video")



        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )




        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {

                if (id == "one") {
/*                    val VIDEO_ID = "f0cdG0IVFM"
                    p1?.loadVideo(VIDEO_ID)*/

                    val intent = Intent(Intent.ACTION_VIEW)

                    intent.data = Uri.parse("https://youtu.be/f0cdG0IVFM8")

                    startActivity(intent)

                } else {

                    if (id == "two") {


                        val intent = Intent(Intent.ACTION_VIEW)

                        intent.data = Uri.parse("https://youtu.be/MGjpCsn5SmE")

                        startActivity(intent)

/*                        val VIDEO_ID = "MGjpCsn5SmE"
                        p1?.loadVideo(VIDEO_ID)*/
                    } else {

                        if (id == "three") {

                            val intent = Intent(Intent.ACTION_VIEW)

                            intent.data = Uri.parse("https://youtu.be/cwnrchkwW2g")

                            startActivity(intent)

/*                            val VIDEO_ID = "cwnrchkwW2g"
                            p1?.loadVideo(VIDEO_ID)*/
                        } else {

                            if (id == "four") {

                                val intent = Intent(Intent.ACTION_VIEW)

                                intent.data = Uri.parse("https://youtu.be/-6WbYaR70zk")

                                startActivity(intent)

/*                                val VIDEO_ID = "-6WbYaR70zk"
                                p1?.loadVideo(VIDEO_ID)*/
                            } else {


                                if (id == "five") {

                                    val intent = Intent(Intent.ACTION_VIEW)

                                    intent.data = Uri.parse("https://youtu.be/e-TCK_Q7Z2M")

                                    startActivity(intent)

/*                                    val VIDEO_ID = "e-TCK_Q7Z2M"
                                    p1?.loadVideo(VIDEO_ID)*/
                                }

                            }

                        }

                    }

                }

            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {

                Toast.makeText(this@VideoOneActivity, "Failed", Toast.LENGTH_SHORT).show()


            }

        }

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

/*        binding.btnPlay.setOnClickListener {



        }*/

        youTubePlayer.initialize(VIDEO_API_KEY, youtubePlayerInit)

    }
}