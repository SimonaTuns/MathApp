package com.ritul.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_more_info.*
import kotlinx.android.synthetic.main.activity_quiz_question.*
import kotlinx.android.synthetic.main.activity_res.*

class Res : AppCompatActivity() {
    var mCurrentPosition:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)


        setRes()

        val button: Button = findViewById(R.id.btnOpenMain)
        button.setOnClickListener {
            val intent1 = Intent(this, PickQuiz::class.java)
            startActivity(intent1)
            finish()
        }


    }

    private  fun setRes(){
        val res = mResList!![mCurrentPosition - 1]

        res_t.text = res.titlu
        res_text.text = res.text1
    }

}