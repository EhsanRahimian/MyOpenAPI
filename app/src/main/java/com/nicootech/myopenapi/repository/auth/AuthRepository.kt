package com.nicootech.myopenapi.repository.auth

import androidx.lifecycle.LiveData
import com.nicootech.myopenapi.api.auth.OpenApiAuthService
import com.nicootech.myopenapi.api.auth.network_responses.LoginResponse
import com.nicootech.myopenapi.api.auth.network_responses.RegistrationResponse
import com.nicootech.myopenapi.persistence.AccountPropertiesDao
import com.nicootech.myopenapi.persistence.AuthTokenDao
import com.nicootech.myopenapi.session.SessionManager
import com.nicootech.myopenapi.util.GenericApiResponse

class AuthRepository
    (
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
    )
{

    fun testLoginRequest(email: String, password: String): LiveData<GenericApiResponse<LoginResponse>> {
        return openApiAuthService.login(email, password)
    }

    fun testRegistrationRequest(
        email: String,
        username: String,
        password: String,
        confirmPassword: String
    ): LiveData<GenericApiResponse<RegistrationResponse>> {
        return openApiAuthService.register(email, username, password, confirmPassword)
    }

}