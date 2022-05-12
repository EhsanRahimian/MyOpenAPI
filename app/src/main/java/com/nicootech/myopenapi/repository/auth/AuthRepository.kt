package com.nicootech.myopenapi.repository.auth

import com.nicootech.myopenapi.api.auth.OpenApiAuthService
import com.nicootech.myopenapi.persistence.AccountPropertiesDao
import com.nicootech.myopenapi.persistence.AuthTokenDao
import com.nicootech.myopenapi.session.SessionManager

class AuthRepository
    (
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
    )
{

}