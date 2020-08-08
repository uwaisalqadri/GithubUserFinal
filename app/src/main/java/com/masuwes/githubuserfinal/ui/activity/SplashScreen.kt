package com.masuwes.githubuserfinal.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.masuwes.githubuserfinal.R

class SplashScreen : AppCompatActivity() {

    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }, 1700)

    }
}