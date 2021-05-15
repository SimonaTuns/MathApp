package com.ritul.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_more_info.*
import kotlinx.android.synthetic.main.activity_quiz_question.*

class MoreInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_info)


        setInfo()

        val button: Button = findViewById(R.id.btnOpenMain)
        button.setOnClickListener {
            val intent1 = Intent(this, QuizQuestionActivity::class.java)
            startActivity(intent1)
            finish()
        }


    }

    private  fun setInfo(){
        val info = mInfoList!![mCurrentPosition - 1]

        slider_image.setImageResource(info.image)
        slider_heading.text = info.titlu
        slider_desc.text = info.text1
    }

    fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_more_info -> {

            }

        }
    }
}