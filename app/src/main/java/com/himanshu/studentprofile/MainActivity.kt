package com.himanshu.studentprofile

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val aboutButton = findViewById<Button>(R.id.aboutButton)
        val homeContent = findViewById<View>(R.id.homeContent)
        val fragmentContainer = findViewById<View>(R.id.fragmentContainer)

        aboutButton.setOnClickListener {

            // Hide home screen
            homeContent.visibility = View.GONE

            // Show fragment screen
            fragmentContainer.visibility = View.VISIBLE

            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainer,
                    ProfileFragment()
                )
                .addToBackStack(null)
                .commit()
        }
    }
}