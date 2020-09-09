package com.lucassimoesmartins.mydeeplinkexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_screen.*

class FirstScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        setUI()
    }

    private fun setUI() {
        title = "First Screen"

        btn_first_screen.setOnClickListener {
            startActivity(Intent(this, SecondScreenActivity::class.java))
        }
    }
}