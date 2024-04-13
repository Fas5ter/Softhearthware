package com.example.softhearthware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGoRegister = findViewById<Button>(R.id.tv_go_to_register)
        tvGoRegister.setOnClickListener{
            goToRegister()
        }

        val tvGoHome = findViewById<Button>(R.id.tv_go_to_home)
        tvGoHome.setOnClickListener{
            goToHome()
        }
    }
    private fun goToRegister(){
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
    private fun goToHome(){
        val i = Intent(this, HomeActivity::class.java)
        startActivity(i)
    }

}