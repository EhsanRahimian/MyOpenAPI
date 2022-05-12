package com.nicootech.myopenapi.ui.auth

import androidx.lifecycle.ViewModel
import com.nicootech.myopenapi.repository.auth.AuthRepository

class AuthViewModel (
    val authRepository: AuthRepository
        ): ViewModel() {

        }