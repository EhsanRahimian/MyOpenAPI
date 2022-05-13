package com.nicootech.myopenapi.ui.auth

import androidx.lifecycle.ViewModel
import com.nicootech.myopenapi.repository.auth.AuthRepository
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(val authRepository: AuthRepository): ViewModel()
{

}