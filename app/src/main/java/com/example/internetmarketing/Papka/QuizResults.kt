package com.example.internetmarketing.Papka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import android.widget.TextView
import android.content.Intent
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
        val correctAnswer = findViewById<TextView>(R.id.correctAnswers)
        val incorrectAnswer = findViewById<TextView>(R.id.incorrectAnswers)
        val getCorrectAnswers = intent.getIntExtra("correct", 0)
        val getInCorrectAnswers = intent.getIntExtra("incorrect", 0)
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