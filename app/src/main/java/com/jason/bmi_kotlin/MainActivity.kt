package com.jason.bmi_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = "BMI"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b_help.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("BMI說明")
                .setMessage("體重(kg)/身高的平方(m^2)")
                .setPositiveButton("OK", null)
                .show()
        }
    }

    fun bmi(view : View) {
        val weight = ed_weight.text.toString().toFloat()
        val height = ed_height.text.toString().toFloat()
        val bmi = weight  / (height*height)
        Log.d(TAG, "Your BMI is $bmi")
        Intent(this, ResultActivity::class.java).apply {
            val bag = Bundle()
            bag.putFloat("BMI_EXTRA", bmi)
            bag.putString("TEST_EXTRA", "Testing")
            putExtras(bag)

            /*putExtra("BMI_EXTRA", bmi)*/
            startActivity(this)
        }

        /*
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
        */

        /*
        Toast.makeText(this, bmi.toString(), Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setMessage(bmi.toString())
            .setTitle("Your BMI")
            .setPositiveButton("OK", null)
            .show()
         */
    }
}
