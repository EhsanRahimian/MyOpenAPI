package com.nicootech.myopenapi.session

import android.app.Application
import com.nicootech.myopenapi.persistence.AuthTokenDao

class SessionManager
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
) {
}