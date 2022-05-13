package com.nicootech.myopenapi.ui.auth

import android.os.Bundle
import android.widget.ProgressBar
import com.nicootech.myopenapi.R
import com.nicootech.myopenapi.ui.BaseActivity

class AuthActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        findViewById<ProgressBar>(R.id.progress_bar)
    }
}