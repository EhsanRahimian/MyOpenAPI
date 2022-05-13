package com.nicootech.myopenapi.di

import com.nicootech.myopenapi.di.auth.AuthFragmentBuildersModule
import com.nicootech.myopenapi.di.auth.AuthModule
import com.nicootech.myopenapi.di.auth.AuthScope
import com.nicootech.myopenapi.di.auth.AuthViewModelModule
import com.nicootech.myopenapi.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}