package com.nicootech.myopenapi.di

import androidx.lifecycle.ViewModelProvider
import com.nicootech.myopenapi.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory
}