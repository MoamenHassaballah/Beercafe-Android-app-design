package com.moaapps.beercafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        findViewById<ImageView>(R.id.back).setOnClickListener {
            finish()
        }

        findViewById<TextView>(R.id.register).setOnClickListener {
            startActivity( Intent(this, SignUpActivity::class.java))
        }
    }
}