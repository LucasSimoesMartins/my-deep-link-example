package com.lucassimoesmartins.mydeeplinkexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SecondScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        setUI()
    }

    private fun setUI() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_content, SecondScreenFragment())
            .commit()
    }
}