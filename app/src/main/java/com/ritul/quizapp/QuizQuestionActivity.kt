package com.ritul.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_more_info.*
import kotlinx.android.synthetic.main.activity_quiz_question.*
 var mCurrentPosition:Int = 1

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswer: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        setQuestion()

        first_option.setOnClickListener(this)
        second_option.setOnClickListener(this)
        third_option.setOnClickListener(this)
        fourth_option.setOnClickListener(this)

    }

    private  fun setQuestion(){
        val que = mQuestionList!![mCurrentPosition - 1]

        defaultOptionView()

        if (mCurrentPosition == mQuestionList!!.size){
            submit_id.text = "Finish"
        }else{
            submit_id.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        questions_id.text  = que!!.question
        first_option.text  = que.first
        second_option.text  = que.second
        third_option.text  = que.third
        fourth_option.text  = que.fourth
    }



    private fun defaultOptionView(){
        val optionsList = ArrayList<TextView>()
        optionsList.add(0, first_option)
        optionsList.add(1, second_option)
        optionsList.add(2, third_option)
        optionsList.add(3, fourth_option)

        submit_id.setOnClickListener(this)
        btn_more_info.setOnClickListener(this)
        for (o in optionsList){
            o.setTextColor(Color.parseColor("#5d7a5f"))
            o.typeface = Typeface.DEFAULT
            o.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){


            R.id.first_option -> {
                selectOpt(first_option, 1)
            }
            R.id.second_option -> {
                selectOpt(second_option, 2)
            }
            R.id.third_option -> {
                selectOpt(third_option, 3)
            }
            R.id.fourth_option -> {
                selectOpt(fourth_option, 4)
            }
            R.id.submit_id -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.CORRECT_ANSWER, mCorrectAnswer)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answers(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        mCorrectAnswer++
                    }
                    answers(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionList!!.size) {
                        submit_id.text = "Finish"
                    } else {
                        submit_id.text = "Go To Next Question"
                    }
                    mSelectedOptionPosition = 0
                }
            }

            R.id.btn_more_info ->{
                val i = Intent(this, MoreInfo::class.java)
                startActivity(i)
            }

        }
    }

    private fun answers(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
                first_option.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                second_option.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                third_option.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                fourth_option.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectOpt(tv: TextView, selectedOptionNum: Int){
        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }


}

