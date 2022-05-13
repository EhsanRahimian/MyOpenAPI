package com.nicootech.myopenapi.di.auth

import com.nicootech.myopenapi.ui.auth.ForgotPasswordFragment
import com.nicootech.myopenapi.ui.auth.LauncherFragment
import com.nicootech.myopenapi.ui.auth.LoginFragment
import com.nicootech.myopenapi.ui.auth.RegisterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeLauncherFragment(): LauncherFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector()
    abstract fun contributeForgotPasswordFragment(): ForgotPasswordFragment

}