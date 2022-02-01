package com.moaapps.beercafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        findViewById<ImageView>(R.id.back).setOnClickListener {
            finish()
        }

        findViewById<TextView>(R.id.sign_in).setOnClickListener {
            startActivity( Intent(this, SignInActivity::class.java))
        }
    }
}