package com.google.samples.apps.nowinandroid.feature.bookmarks.di

import com.google.samples.apps.nowinandroid.core.navigation.NiaNavigator
import com.google.samples.apps.nowinandroid.feature.bookmarks.navigation.BookmarksNavigator
import com.google.samples.apps.nowinandroid.feature.bookmarks.navigation.BookmarksNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
internal interface BookmarksSingletonModule {
    @Binds
    @IntoMap @ClassKey(BookmarksNavigator::class)
    fun bindsBookmarksNavigator(impl: BookmarksNavigator): NiaNavigator<*, * , *>

    companion object {
        @Provides
        fun provideBookmarksNavigator(): BookmarksNavigator = BookmarksNavigatorImpl()
    }
}