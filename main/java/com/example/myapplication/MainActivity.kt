package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeImage: ImageView = findViewById(R.id.homeImage)
        homeImage.setImageResource(R.drawable.home)

        val registerButton: Button = findViewById(R.id.registerButton)
        val signInButton: Button = findViewById(R.id.signInButton)

        // Use Glide or Picasso to load the image into the ImageView
        // For example, with Glide:
        // Glide.with(this).load(R.drawable.home_image).into(homeImage)

        registerButton.setOnClickListener {
            // Intent to navigate to the RegistrationActivity
            startActivity(Intent(this, RegistrationActivity::class.java))
        }

        signInButton.setOnClickListener {
            // Intent to navigate to the SignInActivity
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}
