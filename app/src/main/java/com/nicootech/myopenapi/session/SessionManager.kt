package com.nicootech.myopenapi.session

import android.app.Application
import com.nicootech.myopenapi.persistence.AuthTokenDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
)
{
}