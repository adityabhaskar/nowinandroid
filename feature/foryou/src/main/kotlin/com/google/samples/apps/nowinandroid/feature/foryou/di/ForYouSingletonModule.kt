package com.google.samples.apps.nowinandroid.feature.foryou.di

import com.google.samples.apps.nowinandroid.core.navigation.NiaNavigator
import com.google.samples.apps.nowinandroid.feature.foryou.navigation.ForYouNavigator
import com.google.samples.apps.nowinandroid.feature.foryou.navigation.ForYouNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
internal interface ForYouSingletonModule {
    @Binds
    @IntoMap @ClassKey(ForYouNavigator::class)
    fun bindsForYouBaseNavigator(impl: ForYouNavigator): NiaNavigator<*, *, *>

    companion object {
        @Provides
        fun providesForYouBaseNavigator(): ForYouNavigator = ForYouNavigatorImpl()
    }
}