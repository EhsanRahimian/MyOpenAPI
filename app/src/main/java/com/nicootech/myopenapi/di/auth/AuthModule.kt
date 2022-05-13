package com.nicootech.myopenapi.di.auth

import com.nicootech.myopenapi.api.auth.OpenApiAuthService
import com.nicootech.myopenapi.persistence.AccountPropertiesDao
import com.nicootech.myopenapi.persistence.AuthTokenDao
import com.nicootech.myopenapi.repository.auth.AuthRepository
import com.nicootech.myopenapi.session.SessionManager
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AuthModule{

    // TEMPORARY this api service is fake now
    @AuthScope
    @Provides
    fun provideFakeApiService(): OpenApiAuthService {
        return Retrofit.Builder()
            .baseUrl("https://open-api.xyz")
            .build()
            .create(OpenApiAuthService::class.java)
    }

    @AuthScope
    @Provides
    fun provideAuthRepository(
        sessionManager: SessionManager,
        authTokenDao: AuthTokenDao,
        accountPropertiesDao: AccountPropertiesDao,
        openApiAuthService: OpenApiAuthService
    ): AuthRepository {
        return AuthRepository(
            authTokenDao,
            accountPropertiesDao,
            openApiAuthService,
            sessionManager
        )
    }

}