package com.example.softhearthware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvGoHome = findViewById<Button>(R.id.tv_go_to_home)
        tvGoHome.setOnClickListener{
            goToHome()
        }

        val tvGoHistory = findViewById<Button>(R.id.tv_go_to_history)
        tvGoHistory.setOnClickListener{
            goToHistory()
        }

        val tvGoProfile = findViewById<Button>(R.id.tv_go_to_profile)
        tvGoProfile.setOnClickListener{
            goToProfile()
        }


    }
    private fun goToHome(){
        val i = Intent(this, HomeActivity::class.java)
        startActivity(i)
    }
    private fun goToHistory(){
        val i = Intent(this, HistoryActivity::class.java)
        startActivity(i)
    }
    private fun goToProfile(){
        val i = Intent(this, ProfileActivity::class.java)
        startActivity(i)
    }
}