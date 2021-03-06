package com.nicootech.myopenapi.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.nicootech.myopenapi.api.auth.network_responses.LoginResponse
import com.nicootech.myopenapi.api.auth.network_responses.RegistrationResponse
import com.nicootech.myopenapi.repository.auth.AuthRepository
import com.nicootech.myopenapi.util.GenericApiResponse
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(val authRepository: AuthRepository): ViewModel()
{

    fun testLogin(): LiveData<GenericApiResponse<LoginResponse>> {
        return authRepository.testLoginRequest(
            "mitchelltabian@gmail.com",
            "codingwithmitch1"
        )
    }

    fun testRegister(): LiveData<GenericApiResponse<RegistrationResponse>> {
        return authRepository.testRegistrationRequest(
            "mitchelltabian1234@gmail.com",
            "mitchelltabian1234",
            "codingwithmitch1",
            "codingwithmitch1"
        )
    }
}