package com.moaapps.beercafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        findViewById<CardView>(R.id.sign_in).setOnClickListener {
            startActivity( Intent(this, SignInActivity::class.java))
        }

        findViewById<CardView>(R.id.sign_up).setOnClickListener {
            startActivity( Intent(this, SignInActivity::class.java))
        }
    }
}