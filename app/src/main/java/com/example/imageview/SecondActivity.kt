package com.example.imageview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    private var x = 5

    private lateinit var imageViewIV:ImageView
    private lateinit var buttonNextBTN:Button

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        imageViewIV = findViewById(R.id.imageViewIV)
        buttonNextBTN = findViewById(R.id.buttonNextBTN)

        buttonNextBTN.setOnClickListener{
            x--
            when (x) {
                4 -> imageViewIV.setImageResource(R.drawable.e25dda8a_ce57_4e36_b4d6_209d2144ff52)
                3 -> imageViewIV.setImageResource(R.drawable.untitled3)
                2 -> imageViewIV.setImageResource(R.drawable._312)
                1 -> imageViewIV.setImageResource(R.drawable._3)
                0 -> {
                    val end = Intent(this,FinishActivity::class.java)
                    startActivity(end)
                    finish()
                }
            }
        }
    }
}