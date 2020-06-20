package com.jason.bmi_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val bmi : Float = intent.getFloatExtra("BMI_EXTRA", 0f)
        val testing : String = intent.getStringExtra("TEST_EXTRA")
        result.setText(bmi.toString() + testing)
    }
}
