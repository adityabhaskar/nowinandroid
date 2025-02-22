package com.google.samples.apps.nowinandroid.di

import com.google.samples.apps.nowinandroid.core.navigation.NiaNavigatorProvider
import com.google.samples.apps.nowinandroid.navigation.NiaNavigatorProviderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface NavigationSingletonModule {
    @Binds
    fun bindNavigatorProvider(impl: NiaNavigatorProviderImpl): NiaNavigatorProvider
}