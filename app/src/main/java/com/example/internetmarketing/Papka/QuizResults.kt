package com.example.internetmarketing.Papka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import android.widget.TextView
import android.content.Intent
import android.graphics.Color
import android.view.WindowManager
import com.example.internetmarketing.HomeActivity
import com.example.internetmarketing.R


class QuizResults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_results)


        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val startNewBtn = findViewById<AppCompatButton>(R.id.startNewQuizBtn)
        val processAnswer = findViewById<TextView>(R.id.processAnswers)
        val correctAnswer = findViewById<TextView>(R.id.correctAnswers)
        val incorrectAnswer = findViewById<TextView>(R.id.incorrectAnswers)
        val getCorrectAnswers = intent.getIntExtra("correct", 0)
        val getInCorrectAnswers = intent.getIntExtra("incorrect", 0)

        if (getCorrectAnswers <= 5){
            processAnswer.text = "Yomon"
            processAnswer.setTextColor(Color.RED)
        }else{
            if (getCorrectAnswers in 6..9){
                processAnswer.text = "Yaxshi"
                processAnswer.setTextColor(Color.MAGENTA)
            }else{

                if (getCorrectAnswers in 11..20){
                    processAnswer.text = "A'lo"
                    processAnswer.setTextColor(Color.YELLOW)
                }

            }
        }
        correctAnswer.text = getCorrectAnswers.toString()
        incorrectAnswer.text = getInCorrectAnswers.toString()
        startNewBtn.setOnClickListener {
            startActivity(Intent(this@QuizResults, HomeActivity::class.java))
            finish()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this@QuizResults, HomeActivity::class.java))
        finish()
    }
}