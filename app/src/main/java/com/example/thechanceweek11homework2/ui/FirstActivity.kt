package com.example.thechanceweek11homework2.ui

import android.content.Intent
import android.view.LayoutInflater
import android.widget.Toast
import com.example.thechanceweek11homework2.databinding.ActivityFirstBinding
import com.example.thechanceweek11homework2.util.Constants

class FirstActivity : BaseActivity<ActivityFirstBinding>() {
    override val LOG_TAG: String = "FIRST_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityFirstBinding = ActivityFirstBinding::inflate

    override fun setup() {

    }

    override fun addCallbacks() {
        binding?.button?.setOnClickListener {
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Constants.EXTRA_TEXT, "This Text From First Activity")
                type="text/plain"
            }
            val shareIntent = Intent.createChooser(intent, null)
            startActivity(shareIntent)
        }
    }

}