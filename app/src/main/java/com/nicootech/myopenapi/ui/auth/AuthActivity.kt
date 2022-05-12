package com.nicootech.myopenapi.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import com.nicootech.myopenapi.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        findViewById<ProgressBar>(R.id.progress_bar)
    }
}