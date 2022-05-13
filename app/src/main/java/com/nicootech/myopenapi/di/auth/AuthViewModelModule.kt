package com.nicootech.myopenapi.di.auth

import androidx.lifecycle.ViewModel
import com.nicootech.myopenapi.di.ViewModelKey
import com.nicootech.myopenapi.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel

}