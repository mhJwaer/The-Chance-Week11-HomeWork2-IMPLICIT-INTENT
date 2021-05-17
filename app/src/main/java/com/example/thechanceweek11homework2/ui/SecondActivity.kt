package com.example.thechanceweek11homework2.ui

import android.view.LayoutInflater
import com.example.thechanceweek11homework2.databinding.ActivitySecondBinding
import com.example.thechanceweek11homework2.util.Constants

class SecondActivity : BaseActivity<ActivitySecondBinding>() {
    override val LOG_TAG: String = "SECOND_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivitySecondBinding = ActivitySecondBinding::inflate

    override fun setup() {
        val extraText: String = intent.getStringExtra(Constants.EXTRA_TEXT).toString()
        log(extraText)
        binding?.textView?.text = extraText
    }

    override fun addCallbacks() {

    }

}