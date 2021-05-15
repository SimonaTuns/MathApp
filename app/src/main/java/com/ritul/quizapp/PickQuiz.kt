package com.ritul.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_pick_quiz.*
import kotlinx.android.synthetic.main.activity_quiz_question.*
var mQuestionList:ArrayList<Question>? = null
var mInfoList:ArrayList<Information>? = null
var mResList:ArrayList<Resource>? = null




class PickQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_quiz)

        mCurrentPosition = 1


        val button1: Button = findViewById(R.id.quiz1_button)
        quiz1_button.setOnClickListener {
            val intent1 = Intent(this, QuizQuestionActivity::class.java)
            mQuestionList = Constants.getQuestion1()
            mInfoList = MoreInfoConst.getInfo1()
            startActivity(intent1)
        }
        val button2: Button = findViewById(R.id.quiz2_button)
        quiz2_button.setOnClickListener {
            val intent2 = Intent(this, QuizQuestionActivity::class.java)
            mQuestionList = Constants.getQuestion2()
            mInfoList = MoreInfoConst.getInfo2()

            startActivity(intent2)
        }
        val button3: Button = findViewById(R.id.quiz3_button)
        quiz3_button.setOnClickListener {
            val intent3 = Intent(this, QuizQuestionActivity::class.java)

            mQuestionList = Constants.getQuestion3()
            mInfoList = MoreInfoConst.getInfo3()

            startActivity(intent3)
        }
        val button4: Button = findViewById(R.id.quiz4_button)
        quiz4_button.setOnClickListener {
            val intent4 = Intent(this, QuizQuestionActivity::class.java)
            mQuestionList = Constants.getQuestion4()
            mInfoList = MoreInfoConst.getInfo4()

            startActivity(intent4)
        }
        val button5: Button = findViewById(R.id.quiz5_button)
        quiz5_button.setOnClickListener {
            val intent5 = Intent(this, QuizQuestionActivity::class.java)
            mQuestionList = Constants.getQuestion5()
            mInfoList = MoreInfoConst.getInfo5()

            startActivity(intent5)
        }
        val button6: Button = findViewById(R.id.quiz6_button)
        quiz6_button.setOnClickListener {
            val intent6 = Intent(this, QuizQuestionActivity::class.java)
            mQuestionList = Constants.getQuestion6()
            mInfoList = MoreInfoConst.getInfo6()


            startActivity(intent6)
        }

        val button_more: Button = findViewById(R.id.more)
        more.setOnClickListener {
            val intent7 = Intent(this, Res::class.java)
            mResList = ResConst.getRes()


            startActivity(intent7)
        }
    }
}