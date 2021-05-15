package com.ritul.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = userName

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)

        if(correctAnswer < 5 && correctAnswer !=10 && correctAnswer !=10){
            tv_congratulations.text = "Try harder"
        } else{
            tv_congratulations.text ="Well done"
        }
        if(correctAnswer ==10){
            tv_congratulations.text = "You got a perfect score"
        }
        if(correctAnswer ==9){
            tv_congratulations.text = "Almost perfect"
        }
        tv_score.text = "Your Score is $correctAnswer out of $totalQuestion"

        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}