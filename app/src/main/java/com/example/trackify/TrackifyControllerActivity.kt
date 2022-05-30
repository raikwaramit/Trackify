package com.example.trackify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TrackifyControllerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trackify_controller)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LoginSignupFragment())
        }
    }
}