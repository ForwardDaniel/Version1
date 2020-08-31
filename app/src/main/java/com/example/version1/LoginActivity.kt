package com.example.version1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            val email = emailLogin.text.toString()
            val password = passwordLogin.text.toString()

            Log.d("Login", "Attempt login with email and password: $email")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
  //              .addOnCompleteListener()
        }

        backToRegisterLogin.setOnClickListener {
            finish()
        }
    }

}